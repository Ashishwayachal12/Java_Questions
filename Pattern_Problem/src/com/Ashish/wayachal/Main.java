package com.Ashish.wayachal;

public class Main {
    public static void main(String[] args) {
        pattern1(10);

    }
    static void  pattern1(int n)
    {
        for (int row =1; row <=n ; row++) {
            for (int col =1 ; col <=row ; col++) {
                System.out.print("$ ");
                
            }
            System.out.println();
            
        }
    }
}
