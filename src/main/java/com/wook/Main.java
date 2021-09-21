package com.wook;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

        System.out.println("anagram false : " + isAnagram("LISTEN", "sfsdfsfd"));
        System.out.println("anagram true : " + isAnagram("race", "care"));
    }

    //order alphabetical and return a string
    public static String orderAlphabetical(String str) {
        char[] chars = str.toCharArray();
        Arrays.sort(chars);
        return new String(chars);
    }

    //return true when is a acronimus
    public static boolean isAnagram(String strOne, String strTwo) {
        String orderOne = null, orderTwo = null;
        boolean response = false;

        orderOne = orderAlphabetical(strOne);
        orderTwo = orderAlphabetical(strTwo);

        if (orderOne.equalsIgnoreCase(orderTwo) == true) {
            response = true;
        }

        return response;
    }
}

