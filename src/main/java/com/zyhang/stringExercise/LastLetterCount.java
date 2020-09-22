package com.zyhang.stringExercise;

/**
 * @author zyhang
 * @create 2020-09-16 9:50 AM
 */
public class LastLetterCount {

    public LastLetterCount() {
    }

    public void countAndSwitch(String str) {
        String[] words = str.split(" ");
        // the number of words ending s/y
        int cntEndS = 0;
        int cntEndY = 0;
        // the first word's index that ending s/y
        int firstIdxEndS = -1;
        int firstIdxEndY = -1;
        for (int i = 0; i < words.length; i++) {
            String word = words[i];
            if (word.charAt(word.length()-1) == 's' || word.charAt(word.length()-1) == 'S') {
                if (cntEndS == 0) {
                    firstIdxEndS = i;
                }
                cntEndS++;
            } else if (word.charAt(word.length()-1) == 'y' || word.charAt(word.length()-1) == 'Y') {
                if (cntEndY == 0) {
                    firstIdxEndY = i;
                }
                cntEndY++;
            }
        }

        // we have words ending in s and y separately
        if (firstIdxEndS != -1 && firstIdxEndY != -1) {
            String temp = words[firstIdxEndS];
            words[firstIdxEndS] = words[firstIdxEndY];
            words[firstIdxEndY] = temp;

            if (words[firstIdxEndS].charAt(0) >= 'A' && words[firstIdxEndS].charAt(0) <= 'Z') { // Capitalize another word's first letter
                words[firstIdxEndS] = Utils.lowwerFirstChar(words[firstIdxEndS]);
                words[firstIdxEndY] = Utils.upperFirstChar(words[firstIdxEndY]);
            }
            if (words[firstIdxEndY].charAt(0) >= 'A' && words[firstIdxEndY].charAt(0) <= 'Z') { // Capitalize another word's first letter
                words[firstIdxEndY] = Utils.lowwerFirstChar(words[firstIdxEndY]);
                words[firstIdxEndS] = Utils.upperFirstChar(words[firstIdxEndS]);
            }
        }
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < words.length; i++) {
            sb.append(words[i]).append(" ");
        }
        //delete last space
        sb.deleteCharAt(sb.length()-1);
        String afterSwitch = sb.toString();

        System.out.println("thr number of words ending with s is: " + cntEndS);
        System.out.println("thr number of words ending with y is: " + cntEndY);

        System.out.println("the new string after switch is: " + afterSwitch);
    }


}
