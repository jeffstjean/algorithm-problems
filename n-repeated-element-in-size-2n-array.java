// https://leetcode.com/problems/n-repeated-element-in-size-2n-array/

class Solution {
    public int repeatedNTimes(int[] A) {
        HashSet<Integer> set = new HashSet<>();
        for(int i = 0; i < A.length; i++) {
            if(set.contains(A[i])) return A[i];
            set.add(A[i]);
        }
        return -1;
    }
}
