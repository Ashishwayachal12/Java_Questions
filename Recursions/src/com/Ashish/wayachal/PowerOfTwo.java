package com.Ashish.wayachal;

public class PowerOfTwo {
    public static void main(String[] args) {
        int n=33;
        boolean ans=(n&(n-1))==0;
        System.out.println(ans);
    }
}
