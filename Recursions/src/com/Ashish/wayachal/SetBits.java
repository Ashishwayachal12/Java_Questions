package com.Ashish.wayachal;

public class SetBits {
    public static void main(String[] args) {
//        int n;
//        for (int i = 0; i <=10 ; i++) {
//            System.out.println(Integer.toBinaryString(i));
//
//        }
        long n=732489210;
        System.out.println(Long.toBinaryString(n));
        System.out.println(setBits(n));

    }
    static long setBits(long n)
    {
        int count=0;

//        while (n>0)
//        {
//            count++;
//            n-=(n&-n);
//        }or
        while (n>0)
        {
            count++;
            n=n&(n-1);
        }
        return count;
    }
}
