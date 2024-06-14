public class Patterns {

    public static void main(String[] args) {

        pattern4(5);

    }

//         (1) *                                  R- >
//             * *                                C- ^
//             * * *
//             * * * *
    static void pattern1(int n){
        for (int i = 0; i < n; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

//            2) * * * *
//               * * * *
//               * * * *
//               * * * *


    static void pattern2(int n){
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print("* ");
            }
            System.out.println();

        }
    }
//                 3)     * * * *
//                        * * *
//                        * *
//                        *
    static void pattern3(int n){
        for (int i = 0; i < n ; i++) {
            for (int j = 0; j < n-i ; j++) {
                System.out.print("* ");
            }
            System.out.println();
            }

    }
//           4)       *
//                    * *
//                    * * *
//                    * *
//                    *

    static void pattern4(int n){
        for (int i = 0; i < 2*n; i++) {
            int colcount = i > n ? 2*n - i : i;
            for (int j = 0; j < colcount; j++) {
                System.out.print("* ");
            }
            System.out.println();

        }

    }
//             5)           *
//                         * *
//                        * * *
//                         * *
//                          *

    static void pattern5(int n){
        for (int i = 0; i < 2*n; i++) {
            int colums = i > n ? 2*n - i : i ;
            
            int spaces = n - colums;
            for (int s = 0; s < spaces; s++) {
                System.out.print(" ");
            }

            for (int col = 0; col < colums; col++) {
                System.out.print("* ");
            }

            System.out.println(" ");
        }


    }
}