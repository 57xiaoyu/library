package com.fengwenyi.app.tools;

import java.util.regex.Pattern;

/**
 * WenyiFeng(xfsy2014@gmail.com)
 * 2017-07-26 15:49
 */

public class RegularUtilWenyiFeng {

    // 正则表达式：验证用户名
    private static String REGEX_USERNAME = "^[a-zA-Z]\\w{5,20}$";

    // 正则表达式：验证密码
    private static String REGEX_PASSWORD = "^[a-zA-Z0-9]{6,20}$";

    /**
     * 正则表达式：验证手机号
     */
    private static String REGEX_MOBILE = "^((17[0-9])|(14[0-9])|(13[0-9])|(15[^4,\\D])|(18[0,5-9]))\\d{8}$";

    // 正则表达式：验证邮箱
    private static String REGEX_EMAIL = "^([a-z0-9A-Z]+[-|\\.]?)+[a-z0-9A-Z]@([a-z0-9A-Z]+(-[a-z0-9A-Z]+)?\\.)+[a-zA-Z]{2,}$";

    // 正则表达式：验证汉字
    private static String REGEX_CHINESE = "^[\u4e00-\u9fa5],{0,}$";

    // 正则表达式：验证身份证
    private static String REGEX_ID_CARD = "(^\\d{18}$)|(^\\d{15}$)";

    // 正则表达式：验证URL
    private static String REGEX_URL = "http(s)?://([\\w-]+\\.)+[\\w-]+(/[\\w- ./?%&=]*)?";

    // 正则表达式：验证IP地址
    private static String REGEX_IP_ADDR = "(25[0-5]|2[0-4]\\d|[0-1]\\d{2}|[1-9]?\\d)";

    // 正则表达式：数字
    private static String REGEX_NUMBER = "^[0-9]$";

    // 自定义正则规则
    private static String REGEX_CUSTOM;

    /**
     * 构造方法，自定义正则规则
     * @param REGEX_CUSTOM
     */
    public RegularUtilWenyiFeng(String REGEX_CUSTOM) {
        this.REGEX_CUSTOM = REGEX_CUSTOM;
    }

    /**
     * 自定义验证
     * @param str
     * @return
     */
    public boolean customVerify(String str) {
        return Pattern.matches(REGEX_CUSTOM, str);
    }

    /**
     * 校验用户名
     *
     * @param username
     * @return 校验通过返回true，否则返回false
     */
    public static boolean isUsername(String username) {
        return Pattern.matches(REGEX_USERNAME, username);
    }

    /**
     * 校验密码
     *
     * @param password
     * @return 校验通过返回true，否则返回false
     */
    public static boolean isPassword(String password) {
        return Pattern.matches(REGEX_PASSWORD, password);
    }

    /**
     * 校验手机号
     *
     * @param mobile
     * @return 校验通过返回true，否则返回false
     */
    public static boolean isMobile(String mobile) {
        return Pattern.matches(REGEX_MOBILE, mobile);
    }

    /**
     * 校验邮箱
     *
     * @param email
     * @return 校验通过返回true，否则返回false
     */
    public static boolean isEmail(String email) {
        return Pattern.matches(REGEX_EMAIL, email);
    }

    /**
     * 校验汉字
     *
     * @param chinese
     * @return 校验通过返回true，否则返回false
     */
    public static boolean isChinese(String chinese) {
        return Pattern.matches(REGEX_CHINESE, chinese);
    }

    /**
     * 校验身份证
     *
     * @param idCard
     * @return 校验通过返回true，否则返回false
     */
    public static boolean isIDCard(String idCard) {
        return Pattern.matches(REGEX_ID_CARD, idCard);
    }

    /**
     * 校验URL
     *
     * @param url
     * @return 校验通过返回true，否则返回false
     */
    public static boolean isUrl(String url) {
        return Pattern.matches(REGEX_URL, url);
    }

    /**
     * 校验IP地址
     *
     * @param ipAddr
     * @return
     */
    public static boolean isIPAddr(String ipAddr) {
        return Pattern.matches(REGEX_IP_ADDR, ipAddr);
    }

    /**
     * 是不是数字
     * @param number
     * @return
     */
    public static boolean isNumber(String number) {
        return Pattern.matches(REGEX_NUMBER, number);
    }
}
