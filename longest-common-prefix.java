// https://leetcode.com/problems/longest-common-prefix

class Solution {
    public String longestCommonPrefix(String[] strs) {
        if(strs.length == 0) return "";
        if(strs.length == 1) return strs[0];
        int minLength = Integer.MAX_VALUE;
        for(String str : strs) {
            if(str.length() < minLength) minLength = str.length();
        }
        String prefix = "";
        for(int c = 0; c < minLength; c++) {
            char letter = strs[0].charAt(c);
            for(int s = 1; s < strs.length; s++) {
                if(strs[s].charAt(c) != letter) return prefix;
            }
            prefix += Character.toString(letter);
        }
        return prefix;
    }
}
