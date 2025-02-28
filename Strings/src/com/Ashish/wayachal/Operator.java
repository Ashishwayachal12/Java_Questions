package com.Ashish.wayachal;

import java.sql.Array;
import java.util.ArrayList;

public class Operator {
    public static void main(String[] args) {
        System.out.println('a'+'b');
        System.out.println("a"+"b");
        System.out.println((char) ('a'+3));
        System.out.println("a"+1);
        System.out.println("Ashish"+new ArrayList<Integer>());

        System.out.println("Ashish"+new Integer(56));
        System.out.println(new Integer(56)+""+new ArrayList<Integer>());
    }
}
