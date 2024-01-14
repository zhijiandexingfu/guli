package com.atguigu.gulimall.guliproduct.service.impl;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.atguigu.common.utils.PageUtils;
import com.atguigu.common.utils.Query;

import com.atguigu.gulimall.guliproduct.dao.CategoryDao;
import com.atguigu.gulimall.guliproduct.entity.CategoryEntity;
import com.atguigu.gulimall.guliproduct.service.CategoryService;


@Service("categoryService")
public class CategoryServiceImpl extends ServiceImpl<CategoryDao, CategoryEntity> implements CategoryService {

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        IPage<CategoryEntity> page = this.page(
                new Query<CategoryEntity>().getPage(params),
                new QueryWrapper<CategoryEntity>()
        );

        return new PageUtils(page);
    }

    public List<CategoryEntity> getMenulist() {
       //查找所有的菜单项
        List<CategoryEntity> categoryEntities = baseMapper.selectList(null);
        // 组装子菜单
        List<CategoryEntity> res = categoryEntities
                .stream()
                //一级分类
                .filter((menu) -> {
                    return menu.getParentCid() == 0;
                })
                .map((menu) -> {
                    menu.setChildrenList(this.buildChildrenList(menu,categoryEntities));
                    return menu;
                })
                .sorted((menu1, menu2) -> {
                    return (menu1.getSort() == null ? 0 : menu1.getSort()) - (menu2.getSort() == null ? 0 : menu2.getSort());
                }).collect(Collectors.toList());
        //排序
        return res;
    }

    @Override
    public void deleteByIds(List<Long> asList) {
        //todo 检查当前id是否有使用
        baseMapper.deleteBatchIds(asList);
    }

    private List<CategoryEntity> buildChildrenList(CategoryEntity curMenu, List<CategoryEntity> allMenu) {
        List<CategoryEntity> childrenMenuList = allMenu
                .stream()
                .filter(othermMenu -> {
                    return (othermMenu.getParentCid() == curMenu.getCatId());
                })
                .map(targetMenu -> {
                    targetMenu.setChildrenList(buildChildrenList(targetMenu, allMenu));
                    return targetMenu;
                })
                .sorted((menu1, menu2) -> {
                    return (menu1.getSort() == null ? 0 : menu1.getSort())
                            - (menu2.getSort() == null ? 0 : menu2.getSort());
                })
                .collect(Collectors.toList());
        return childrenMenuList;
    }


}