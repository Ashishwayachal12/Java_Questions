package com.Ashish.wayachal;


import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[]arr={5,4,3,2,1};
        selectionSort(arr);
        System.out.println(Arrays.toString(arr));


    }

     static void selectionSort(int[]arr)
     {
         for (int i = 0; i < arr.length; i++) {
             int last= arr.length-i-1;
             int maxIndex=getMaxIndex(arr,0,last);

             swap(arr,maxIndex,last);
             
         }
     }
     static void swap(int[]arr,int first,int seconds)
     {
         int temp=arr[first];
         arr[first]=arr[seconds];
         arr[seconds]=temp;
     }

    private static int getMaxIndex(int[] arr, int start, int end) {
        int max=start;
        for (int i = start; i <=end ; i++) {
            if(arr[max] < arr[i])
            {
                max=i;
            }
            
        }
        return max;
    }




    static  void bubbleSort(int[] arr)
    {
        for (int i = 0; i < arr.length ; i++) {
            for (int j = 1; j <=arr.length-i-1; j++) {
                if(arr[j]<arr[j-1])
                {
                    int temp=arr[j];
                    arr[j]=arr[j-1];
                    arr[j-1]=temp;
                }

            }
            
        }

    }
}