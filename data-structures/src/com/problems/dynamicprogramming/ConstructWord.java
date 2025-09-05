package com.problems.dynamicprogramming;

import java.util.HashSet;
import java.util.Set;

public class ConstructWord {

    public static void main(String[] args) {
        System.out.println(canConstruct("abcd", new String[]{"ab", "de", "ac", "cd", "abc", "d"}, new HashSet<>()));
        System.out.println(canConstruct("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaf",
                new String[]{"aaaaaaaaaaaaaaaaaa", "a", "aa", "aaaaa", "aaaaaaa", "aaaaaaaa", "aaaaaaaaaaa", "aaaaaaaae"},
                new HashSet<>())
        );

        System.out.println(waysToConstruct("abcd", new String[]{"ab", "de", "ac", "cd", "abc", "d"}));
    }

    public static boolean canConstruct(String word, String[] dictionary, Set<String> set) {
//        if (set.contains(word)) return true;
        for (String dictWord : dictionary) {
            if (word.indexOf(dictWord) == 0) {
                if (word.length() == dictWord.length()) {
//                    set.add(word);
                    return true;
                }
                return canConstruct(word.substring(dictWord.length()), dictionary, set);
            }
        }
        return false;
    }

    public static int waysToConstruct(String word, String[] dictionary) {
        int count = 0;
        for (String dictWord : dictionary) {
            if (word.indexOf(dictWord) == 0) {
                if (word.length() == dictWord.length()) count++;
                return count + waysToConstruct(word.substring(dictWord.length()), dictionary);
            }
        }
        return count;
    }
}