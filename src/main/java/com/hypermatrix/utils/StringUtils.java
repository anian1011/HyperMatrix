package com.hypermatrix.utils;

/**
 * Created by anian on 2016/6/25.
 */
public class StringUtils {
    public static boolean isNum(String str){
        return str.matches("^[-+]?(([0-9]+)([.]([0-9]+))?|([.]([0-9]+))?)$");
    }
}
