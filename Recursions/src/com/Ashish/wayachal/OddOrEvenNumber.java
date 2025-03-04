package com.Ashish.wayachal;

public class OddOrEvenNumber {
    public static void main(String[] args) {
     int n=7;
        System.out.println(isoddoreven(n));

    }

    static boolean isoddoreven(int n) {
        return (n&1)==1;
    }

}
