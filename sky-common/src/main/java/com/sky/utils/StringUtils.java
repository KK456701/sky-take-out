package com.sky.utils;   // 请替换成你项目实际的包名（与 JwtUtil 的包名一致）

/**
 * 字符串工具类 - 演示新增文件
 */
public class StringUtils {

    /**
     * 判断字符串是否为 null 或仅包含空白字符
     */
    public static boolean isBlank(String str) {
        return str == null || str.trim().isEmpty();
    }

    /**
     * 判断字符串不为空且不含空白字符
     */
    public static boolean isNotBlank(String str) {
        return !isBlank(str);
    }

    /**
     * 安全截断字符串（支持中文）
     * @param str 原始字符串
     * @param maxLength 最大长度（超过则加...）
     */
    public static String truncate(String str, int maxLength) {
        if (isBlank(str)) return "";
        if (str.length() <= maxLength) return str;
        return str.substring(0, maxLength) + "...";
    }
}