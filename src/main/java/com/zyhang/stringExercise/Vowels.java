package com.zyhang.stringExercise;

/**
 * @author zyhang
 * @create 2020-09-16 9:48 AM
 */
public class Vowels {

    public Vowels() {
    }

    public int countVowels(String str) {
        int cnt = 0;
        for (char c : str.toCharArray()) {
            if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
                cnt++;
            }
        }
        return cnt;
    }

}
