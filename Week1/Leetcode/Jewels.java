package com.isaxved.Week1.Week1.Leetcode;

import java.util.Hashtable;

public class Jewels {
    public static void main(String[] args) {
        String J = "aA";
        String S = "aaA";
        Hashtable<Character,Integer> hashTable = new Hashtable<>();
        char[] charArr = J.toCharArray();
        for(char s : charArr) {
            hashTable.put(s,0);
        }
        int counter = 0;
        for(int i = 0; i < S.length(); i++) {
            if (hashTable.containsKey(S.charAt(i))) counter++;
        }
        System.out.println(counter);
    }
}
