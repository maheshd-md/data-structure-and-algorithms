package com;

import java.util.LinkedHashMap;
import java.util.Map;

public class StringCompressor {
    public static String compress(String input) {

        if (null == input) {
            return null;
        }
        
        Map<String, Integer> map = new LinkedHashMap<>();

        input.chars().forEach(c -> {
            String ch = Character.toString(c);
            map.put(ch, map.getOrDefault(ch, 0) + 1);
        });

        StringBuilder output = new StringBuilder();
        for (int i=0; i < input.length(); i++) {
            int count = 1;
            while (i < input.length()-1 && input.charAt(i) == input.charAt(i+1)) {
                count++; //2
                i++; // 1
            }
            output.append(input.charAt(i)).append(count);
        }

        return output.length() < input.length() ? output.toString() : input;
    }
 
    public static void main(String[] args) {
        String test = "kkkkk";
        System.out.println("Compressed: " + compress(test));
    }
}