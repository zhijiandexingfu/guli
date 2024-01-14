package com.atguigu.common.validator.group;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class ListValConstraintValidator implements ConstraintValidator<ListValue, Integer> {
    Set<Integer> valSet = new HashSet<>();

    @Override
    public void initialize(ListValue constraintAnnotation) {
        Arrays.stream(constraintAnnotation.vals()).forEach((ele)->valSet.add(ele));
    }

    @Override
    public boolean isValid(Integer value, ConstraintValidatorContext constraintValidatorContext) {
        return valSet.contains(value);
    }
}
