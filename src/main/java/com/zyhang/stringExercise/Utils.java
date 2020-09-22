package com.zyhang.stringExercise;

/**
 * @author zyhang
 * @create 2020-09-16 10:04 PM
 */
public class Utils {

    public static String upperFirstChar(String word) {
        char[] ch = word.toCharArray();
        ch[0] = Character.toUpperCase(ch[0]);
        return new String(ch);
    }

    public static String lowwerFirstChar(String word) {
        char[] ch = word.toCharArray();
        ch[0] = Character.toLowerCase(ch[0]);
        return new String(ch);
    }

    // if the last char is ',', remove it
    public static String purify(String word) {
        if ( !Character.isLetter(word.charAt(word.length()-1)) ) {
            StringBuilder sb = new StringBuilder(word);
            sb.deleteCharAt(sb.length()-1);
            word = sb.toString();
        }
        return word;
    }
}
