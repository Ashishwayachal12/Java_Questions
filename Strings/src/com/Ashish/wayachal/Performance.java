package com.Ashish.wayachal;

public class Performance {
    public static void main(String[] args) {
        String series="";
        for (int i = 0; i <26 ; i++) {
            char ch=(char)('a'+i);
//            System.out.print(ch+" ");
            series=series+ch;
        }
        System.out.println(series);
        System.out.println("a"+'b');
    }
}
