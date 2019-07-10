// https://leetcode.com/problems/roman-to-integer/submissions/

class Solution {
    public int romanToInt(String s) {
        int total = 0;
        for(int i = 0; i < s.length(); i++) {
            char currentChar = s.charAt(i);
            if(currentChar == 'V') total+=5;
            else if(currentChar == 'L') total+=50;
            else if(currentChar == 'D') total+=500;
            else if(currentChar == 'M') total+=1000;
            else {
                boolean isAnotherChar = i < s.length()-1;
                if(currentChar == 'I') {
                    if(!isAnotherChar) total+=1;
                    else {
                        char nextChar = s.charAt(i+1);
                        if(nextChar == 'V') {
                            total+=4;
                            i++;
                        }
                        else if(nextChar == 'X') {
                            total+=9;
                            i++;
                        }
                        else total+=1;
                    }
                }

                else if(currentChar == 'X') {
                    if(!isAnotherChar) total+=10;
                    else {
                        char nextChar = s.charAt(i+1);
                        if(nextChar == 'L') {
                            total+=40;
                            i++;
                        }
                        else if(nextChar == 'C') {
                            total+=90;
                            i++;
                        }
                        else total+=10;
                    }
                }
                
                else if(currentChar == 'C') {
                    if(!isAnotherChar) total+=100;
                    else {
                        char nextChar = s.charAt(i+1);
                        if(nextChar == 'D') {
                            total+=400;
                            i++;
                        }
                        else if(nextChar == 'M') {
                            total+=900;
                            i++;
                        }
                        else total+=100;
                    }
                }
            }
        }
        return total;
    }
}



