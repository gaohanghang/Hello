package 入门.反转一个3位整数;

/**
 * 反转一个3位整数
 */
public class Solution {
    /**
     * @param number：A 3-digit bumber.
     * @return：Reversed number.
     */
    public int reverseInteger(int number){
        // writer your code here  // 321
        int a = number / 100; // 3
        int b = number / 10; // 32
        b -= a*10; // b = 32 - 30 = 2
        int c = number % 10;

        return a+(b*10)+c*100; //123
    }
}
