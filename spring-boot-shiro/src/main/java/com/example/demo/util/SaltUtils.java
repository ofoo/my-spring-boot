package com.example.demo.util;

import java.util.Random;

public class SaltUtils {

    /**
     * 随机生成定长的Salt
     * @param n 长度
     * @return Salt
     */
    public static String getSalt(int n) {
        char[] chars = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789~!@#$%^&*()_+|{}:.,<>?/".toCharArray();
        
        StringBuilder stringBuilder = new StringBuilder();

        for (int i = 0; i < n; i++) {
            char c = chars[new Random().nextInt(chars.length)];
            stringBuilder.append(c);
        }

        return stringBuilder.toString();
    }
    
}
