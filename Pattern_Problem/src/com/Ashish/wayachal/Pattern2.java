package com.Ashish.wayachal;

public class Pattern2 {
    public static void main(String[] args) {
pattern(10);
    }
    static void pattern(int n)
    {
        for (int row = 1; row <=n ; row++) {
            for (int col = 1; col <=n ; col++) {
                System.out.print("*");

            }
            System.out.println();
        }
    }
}
