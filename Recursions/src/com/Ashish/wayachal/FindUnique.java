package com.Ashish.wayachal;

public class FindUnique {
    public static void main(String[] args) {
             int[] num={2,3,3,4,2,6,4};
        System.out.println(ansarr(num));
    }

    private static int ansarr(int[] num) {
        int unique=0;

        for(int arr:num)
        {
            unique =unique^arr;
        }
        return unique;
    }

}
