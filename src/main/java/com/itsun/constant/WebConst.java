package com.itsun.constant;

import org.springframework.stereotype.Component;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by BlueT on 2017/3/3.
 */
@Component
public class WebConst {
    public static Map<String, String> initConfig = new HashMap<>();


    public static String LOGIN_SESSION_KEY = "login_user";
    public static final int MAX_POSTS = 9999;
    public static final String USER_IN_COOKIE = "S_L_ID";
    public static final String GLOBLY_COOKNAME = "FEEDBACK";
    public static String AES_SALT = "0123456789abcdef";
    /**
     * 上传文件最大1M
     */
    public static Integer MAX_FILE_SIZE = 3048576;

    /**
     * 成功返回
     */
    public static String SUCCESS_RESULT = "SUCCESS";


}
