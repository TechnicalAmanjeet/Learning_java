package com.Amanjeet;

public class pattern {
    public static void main(String[] args) {
        pattern13(5);
    }

    private static void pattern13(int r) {

    }

    private static void pattern12(int r) {
        // upper half
        for(int i=1;i<=r;++i){
            // print => (i) times spaces.
            int s=i;
            for(int j=1;j<s;++j){
                System.out.print(" ");
            }
            // print => (row - i) times *
            int c=r-i;
            for(int j=0;j<=c;++j){
                System.out.print("* ");
            }
            System.out.println();
        }
        // lower half
        for(int i=2;i<=r;++i){
            // print => ( row - i )  times space.
            int s = r-i;
            for(int j=0;j<s;++j){
                System.out.print(" ");
            }
            // print => i times *
            for(int j=0;j<i;++j){
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    private static void pattern11(int r) {
        for(int i=1;i<=r;++i){
            // print => (i) times spaces.
            int s=i;
            for(int j=1;j<s;++j){
                System.out.print(" ");
            }
            // print => (row - i) times *
            int c=r-i;
            for(int j=0;j<=c;++j){
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    private static void pattern10(int r) {
        for(int i=1;i<=r;++i){
            // print => ( row - i )  times space.
            int s = r-i;
            for(int j=0;j<s;++j){
                System.out.print(" ");
            }
            // print => i times *
            for(int j=0;j<i;++j){
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    private static void pattern9(int r) {
        for(int i=1;i<=r;++i){
            // print => (i) times spaces.
            int s=i;
            for(int j=1;j<s;++j){
                System.out.print(" ");
            }
            // print => (row - i) times *
            int c=r-i;
            for(int j=0;j<=c;++j){
                System.out.print("*");
            }
            // for each row print c = ( r - i)
            //int c = r-i;
            for(int j=0;j<c;++j){
                System.out.print("*");
            }
            System.out.println();
        }
    }

    private static void pattern8(int r) {
        for(int i=1;i<=r;++i){
            // print => ( row - i )  times space.
            int s = r-i;
            for(int j=0;j<s;++j){
                System.out.print(" ");
            }
            // print => i times *
            for(int j=0;j<i;++j){
                System.out.print("*");
            }
            // print => (current-1) times *
            for(int j=0;j<i-1;++j){
                System.out.print("*");
            }

            System.out.println();
        }
    }

    private static void pattern7(int r) {
        for(int i=1;i<=r;++i){
            // print => (i) times spaces.
            int s=i;
            for(int j=1;j<s;++j){
                System.out.print(" ");
            }
            // print => (row - i) times *
            int c=r-i;
            for(int j=0;j<=c;++j){
                System.out.print("*");
            }
            System.out.println();
        }
    }

    private static void pattern6(int r) {
        for(int i=1;i<=r;++i){
            // print => ( row - i )  times space.
            int s = r-i;
            for(int j=0;j<s;++j){
                System.out.print(" ");
            }
            // print => i times *
            for(int j=0;j<i;++j){
                System.out.print("*");
            }
            System.out.println();
        }
    }

    private static void pattern5(int r) {
        int originalRow = r;
        r=2*r;
        for(int i=1;i<=r;++i){
            // print col till 1 to current row till current element is equal to row
            // else print 2*originalrow - currentrow times star.
            int c = i<=originalRow ? i : 2*originalRow -i;
            for (int j=1;j<=c;++j){
                System.out.print("*");
            }
            System.out.println();
        }
    }

    private static void pattern4(int r) {
        for(int i=1;i<=r;++i){
            // for every row print no. from 1 till current row as column
            int c=i;
            for(int j=1;j<=c;++j){
                System.out.print(j+" ");
            }
            System.out.println();
        }
    }

    private static void pattern3(int r) {
        for(int i=0;i<r;++i){
            // for each row print c = ( r - i)
            int c = r-i;
            for(int j=0;j<c;++j){
                System.out.print("*");
            }
            System.out.println();
        }
    }

    private static void pattern2(int n) {
        for(int r=0;r<n;++r){
            // for every row print row * "*" as a column.
            for(int c=0;c<=r;++c){
                System.out.print("*");
            }
            System.out.println();
        }
    }

    private static void pattern1(int n) {
        for(int r=0;r<n;++r){
            // for every row print n * as each column.
            for(int c=0;c<n;++c){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
























































