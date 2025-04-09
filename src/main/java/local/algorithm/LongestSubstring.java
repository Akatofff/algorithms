package local.algorithm;

/*
* Найти длину наибольшей уникальной подстроки в строке.
* Пример:
*   Input: "abcabcacb"
*   Output: 3 (abc - наибольшая уникальная подстрока)
*
* */

import java.util.ArrayList;

public class LongestSubstring {

    public static int lengthOfLongestSubstring(String str) {
        ArrayList<Character> substring = new ArrayList<>();
        char[] charsFromStr = str.toCharArray();
        for (char ch : charsFromStr) {
            if (!substring.contains(ch)) {substring.add(ch);}
        }
        return substring.size();
    }
}
