package com.lijp.liblog.util;

/**
 * 字符串操作工具类
 * Created by Li on 2018/7/29.
 */
public class StringUtils {


    /**
     * 字符串是否为空
     * @param str
     *          字符串
     * @return
     *      true:字符串为空
     *      false:字符串不为空
     */
    public static boolean isEmpty (String str) {
        // 字符串为空
        if (str == null || str.equals("") || str.trim().equals("")) {
            return true;
        }
        // 字符串不为空
        return false;
    }

}
