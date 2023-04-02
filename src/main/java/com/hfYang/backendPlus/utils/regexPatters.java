package com.hfYang.UserBackend.utils;

/**
 * @program: user-backend
 * @description: 正则验证
 * @author: hfYang
 * @create: 2023-03-11 21:30
 **/


public class regexPatters {

    //校验学号
    public static final String ACCOUNT_REGEX = "2[012]4804[0-4][0-9][0-9]";



    //4到32位的数字,字母,下划线 校验密码
    public static final String PASSWORD_REGEX = "^\\w{4,32}$";
}
