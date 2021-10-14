package com.softin.util;

public class PasswordUtil {
    public enum SecurityLevel{
        WEAK, MEDIUN, STRONG
    }

    public static SecurityLevel assessPassword(String password){
        if (password.length() < 8 || password.matches("[a-zZ]+")) {
            return SecurityLevel.WEAK;
        }

        if (password.matches("[a-zZ0-9]+")) {
            return SecurityLevel.MEDIUN;
        }
        return SecurityLevel.STRONG;

    }
}
