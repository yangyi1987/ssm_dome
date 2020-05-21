package com.javaboy.util;

import java.io.Serializable;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

public class Md5Util {
    public static String Md5(String intStr){
        MessageDigest md5 = null;
        try{
            md5 = MessageDigest.getInstance("MD5");
        } catch (NoSuchAlgorithmException e) {
            System.out.println(e.toString());
            e.printStackTrace();
            return "";
        }
        char[] charArray = intStr.toCharArray();
        byte[] byteArray = new byte[charArray.length];

        for (int i=0;i<charArray.length;i++){
            byteArray[i] = (byte) charArray[i];
        }
        byte[] md5Bytes = md5.digest(byteArray);

        StringBuffer hexValue = new StringBuffer();
        for (int i=0;i<md5Bytes.length;i++){
            int val = ((int)md5Bytes[i]) & 0xff;
            if (val <16){
                hexValue.append(0);
            }
            hexValue.append(Integer.toHexString(val));
        }
        return hexValue.toString();
    }
    //
    public static String KL(String intStr){
        char[] a = intStr.toCharArray();
        for (int i=0;i<a.length;i++){
            a[i] = (char)(a[i] ^ 't');
        }
        String s = new String(a);
        return s;
    }
    // 加密后解密
    public static String JM(String intStr){
        char[] a = intStr.toCharArray();
        for (int i=0;i<a.length;i++){
            a[i] =  (char)(a[i] ^ 't');
        }
        String k = new String(a);
        return k;
    }

}
