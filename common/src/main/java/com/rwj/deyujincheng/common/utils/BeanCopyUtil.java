package com.rwj.deyujincheng.common.utils;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.BeanWrapper;
import org.springframework.beans.BeanWrapperImpl;

import java.beans.PropertyDescriptor;
import java.util.HashSet;
import java.util.Set;

/**
 * @author chichenglong
 * @date 2019/6/21 14:14
 */
public class BeanCopyUtil {
    public BeanCopyUtil() {
    }

    public static String[] getNullPropertyNames(Object from) {
        BeanWrapper src = new BeanWrapperImpl(from);
        PropertyDescriptor[] pds = src.getPropertyDescriptors();
        Set<String> emptyNames = new HashSet();
        PropertyDescriptor[] var4 = pds;
        int var5 = pds.length;

        for(int var6 = 0; var6 < var5; ++var6) {
            PropertyDescriptor pd = var4[var6];
            Object srcValue = src.getPropertyValue(pd.getName());
            if (srcValue == null) {
                emptyNames.add(pd.getName());
            }
        }

        String[] result = new String[emptyNames.size()];
        return (String[])emptyNames.toArray(result);
    }

    public static void copyProperties(Object from, Object to) {
        BeanUtils.copyProperties(from, to);
    }

    public static void copyPropertiesNotNull(Object from, Object to) {
        BeanUtils.copyProperties(from, to, getNullPropertyNames(from));
    }
}
