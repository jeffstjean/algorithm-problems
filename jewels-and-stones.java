// https://leetcode.com/problems/jewels-and-stones/

class Solution {
    public int numJewelsInStones(String J, String S) {
        int count = 0;
        Map<Character, Integer> map = new HashMap<>();
        for(int i = 0; i < J.length(); i++) {
            map.put(J.charAt(i), 0);
            //System.out.println(map);
        }
        for(int i = 0; i < S.length(); i++) {
            if(map.containsKey(S.charAt(i))) count++;
        }
        
        return count;
    }
}
