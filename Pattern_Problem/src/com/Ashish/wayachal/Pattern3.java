package com.Ashish.wayachal;

public class Pattern3 {
    public static void main(String[] args) {
        pattern8(500);

    }

    static void pattern8(int n)
    {
        for (int row = 1; row <2*n ; row++) {
            int c=row >n ? 2*n -row:row;
            for (int space = 0; space <n-c ; space++) {
                System.out.print("  ");

            }
            for (int col = c; col >=1 ; col--) {
                System.out.print(col+" ");

            } for (int col = 2; col <=c ; col++) {
                System.out.print(col+" ");

            }
            System.out.println();

        }
    }

    static void pattern7(int n)
    {
        for (int row = 0; row <n ; row++) {

            for (int space = 0; space <n-row ; space++) {
                System.out.print("  ");

            }
            for (int col = row; col >=1 ; col--) {
                System.out.print(col+" ");

            } for (int col = 2; col <=row ; col++) {
                System.out.print(col+" ");

            }
            System.out.println();
            
        }
    }
    static void pattern6(int n)
    {
        for (int row = 0; row <2 *n ; row++) {
            int totalColsInRow=row >n ? 2*n -row:row;
            int space =n-totalColsInRow;
            for (int s = 0; s <space ; s++) {
                System.out.print(" ");
                
            }
            for (int col = 0; col <totalColsInRow ; col++) {
                System.out.print("* " );
            }
            System.out.println();

        }
    }
    static void pattern5(int n)
    {
        for (int row = 0; row <2 *n ; row++) {
            int totalColsInRow=row >n ? 2*n -row:row;
            for (int col = 0; col <totalColsInRow ; col++) {
                System.out.print(col +" " );
            }
            System.out.println();

        }
    }

    static void pattern4(int n)
    {
        for (int row = 1; row <=n; row++) {
            for (int col =1 ; col <=row ; col++) {
                System.out.print(col+" ");

            }
            System.out.println();

        }
    }

    static void pattern(int n)
    {
        for (int row = 1; row <=n; row++) {
            for (int col =1 ; col <=n-row+1 ; col++) {
                System.out.print("* ");

            }
            System.out.println();

        }
    }
}
