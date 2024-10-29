/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cuong.dev.util;

import java.security.SecureRandom;

/**
 *
 * @author BAP VN
 */
public class StringHelper {
    static final String  AB= "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyx";
    static SecureRandom rnd = new SecureRandom();
    public static String randomString(int len){
        StringBuilder sb = new StringBuilder(len);
        for (int i = 0; i < len ; i++){
            sb.append(AB.charAt(rnd.nextInt(AB.length())));
        }
        return sb.toString();
    }
}
