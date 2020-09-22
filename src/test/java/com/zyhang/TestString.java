package com.zyhang;

import com.zyhang.stringExercise.*;
import org.junit.Test;

/**
 * @author zyhang
 * @create 2020-09-22 2:49 PM
 */
public class TestString {

    @Test
    public void testVowels() {
        Vowels vowels = new Vowels();
        String str = "Hello, world";
        int cntVowels = vowels.countVowels(str);
        System.out.println("the number of vowels is: " + cntVowels);
    }

    @Test
    public void testPalindrome() {
        Palindrome palindrome = new Palindrome();
        String str = "Was it a car or a cat I saw";
        System.out.println("reversed string is: " + palindrome.reverse(str));
        System.out.println("is this string palindrome? " + palindrome.isPalindrome(str));
    }

    @Test
    public void testWord() {
        Words words = new Words();
        String str = "my first name is hang, my last name is zhang, what is your name?";
        words.countWords(str);
    }

    @Test
    public void testConsonants() {
        Consonants consonants = new Consonants();
        String str = "hello, I enjoy coding";
        consonants.countAndReplaceConsonants(str);
    }

    @Test
    public void testLastLetterCount() {
        LastLetterCount lastLetterCount = new LastLetterCount();
        String str = "This is why we have words that end with y";
        lastLetterCount.countAndSwitch(str);
    }

}
