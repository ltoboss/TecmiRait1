package com.luisosuna.tec.appp1.helper;

import android.util.Base64;

import java.io.UnsupportedEncodingException;

public class Helper {

    public static String getAuthToken(String email, String password) {
        byte[] data = new byte[0];
        try {
            data = (email + ":" + password).getBytes("UTF-8");
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        }
        return "Basic " + Base64.encodeToString(data, Base64.NO_WRAP);
    }

}
