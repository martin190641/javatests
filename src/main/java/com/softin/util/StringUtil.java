package com.softin.util;

public class StringUtil {

    public static String repeat(String str, int times) {
        return str.repeat(times);
    }

    public static boolean isEmpty(String string){

        return string == null || string.trim().isEmpty();
    }

}
