// https://leetcode.com/problems/to-lower-case/

class Solution {
    public String toLowerCase(String str) {
        char[] charArray = str.toCharArray();
        for(int i = 0; i < charArray.length; i++) {
            int ascii = (int)charArray[i];
            if(ascii <= 90 && ascii >= 65) { 
                charArray[i] = (char)(ascii+=32);
            }
        }
        return new String(charArray);
    }
}
