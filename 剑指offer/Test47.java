package com.github.yuehsutong.剑指offer;

/**
 * Author: 王俊超
 * Date: 2015-06-14
 * Time: 16:07
 * Declaration: All Rights Reserved !!!
 */
public class Test47 {
    public static int add(int x, int y) {
        int sum;
        int carry;

        do {
            sum = x ^ y; //1。不进位加法
            // x&y的某一位是1说明，它是它的前一位的进位，所以向左移动一位
            carry = (x & y) << 1; //2。只有1&1才需要进位，等于0不需要进位
            x = sum;
            y = carry;
        } while (y != 0);

        return x;
    }

//    1+1=2:
//    sum = 1^1= 0;
//    carry = (1&1)<<1 = 10;
//    carry != 0;
//    x=sum=0, y=carry=10;
//    sum = 0 ^ 10 = 10;
//    carry = (0&10)<<1=0;
//    carry == 0;
    public static void main(String[] args) {
        System.out.println(add(1, 2) + ", " + (1 + 2));
        System.out.println(add(13, 34)+ ", " + (13 + 34));
        System.out.println(add(19, 85)+ ", " + (19 + 95));
        System.out.println(add(865, 245)+ ", " + (865 + 245));
    }
}
