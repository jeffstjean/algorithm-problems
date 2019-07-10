// https://leetcode.com/problems/hamming-distance/

class Solution {
    public int hammingDistance(int x, int y) {
        int count = 0;
        int iterator = 0b0001;
        int combination = x ^ y;
        for(int i = 0; i < 31; i++) {
            if((combination & iterator) != 0) count++;
            iterator = iterator << 1;
        }
        return count;
    }

}


//  1 ,    2
// 0001, 0010 -> 1

//  1 ,    4
// 0001, 0100 -> 2

//  1 ,    8
// 0001, 1000 -> 3

//  2 ,    4
// 0010, 0100 -> 1

//  2 ,    8
// 0010, 1000 -> 2

//  4 ,    8
// 0100, 1000 -> 1
