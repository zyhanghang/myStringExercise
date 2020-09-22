package com.zyhang.stringExercise;

import java.util.HashMap;
import java.util.Map;

/**
 * @author zyhang
 * @create 2020-09-16 9:49 AM
 */
public class Words {

    public Words() {
    }

    public void countWords(String str) {
        String[] words = str.split(" ");
        Map<String, Integer> map = new HashMap<>();
        for (String word : words) {
            word = Utils.purify(word);
            map.put(word, map.getOrDefault(word, 0) + 1);
        }
        // display
        for (String word : map.keySet()) {
            System.out.println("word=" + word + ", count=" + map.get(word));
        }
    }
}
