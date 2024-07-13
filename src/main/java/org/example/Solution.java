package org.example;

public class Solution {
    public boolean isPalindrome(String s) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            if (Character.isLetter(s.charAt(i)) || Character.isDigit(s.charAt(i))) {
                sb.append(Character.toLowerCase(s.charAt(i)));
            }
        }
        String result = sb.toString();
        for (int i = 0; i < result.length()/2; i++) {
            if (result.charAt(i) != result.charAt(result.length() - 1 - i)) {
                return false;
            }
        }
        return true;
    }
}
