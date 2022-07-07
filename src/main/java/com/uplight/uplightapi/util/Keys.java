package com.uplight.uplightapi.util;

import javax.crypto.KeyGenerator;
import javax.crypto.SecretKey;
import java.security.NoSuchAlgorithmException;
import java.security.NoSuchProviderException;

import static io.jsonwebtoken.impl.TextCodec.BASE64;

public class Keys {


    public static byte[] getRandomKey() throws NoSuchAlgorithmException,
            NoSuchProviderException {
        KeyGenerator keyGen = KeyGenerator.getInstance("HmacSHA256");
        keyGen.init(256);
        SecretKey secretKey = keyGen.generateKey();
        return secretKey.getEncoded();
    }

    public static void main(String args[])throws Exception{

        System.out.println(BASE64.encode(Keys.getRandomKey()));
    }
}
