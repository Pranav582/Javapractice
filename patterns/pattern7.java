// public class pattern7 {
//     public static void main(String[] args) {
//         //int num = 10;

//         for (int cols = 1 ; cols <= 5; cols++){
//             for (int rows = 1; rows <= cols; rows++ ){
//                 System.out.print(rows);
//                 for (int i = 10; i >1; i--) {
//                     for (int j = 1; j<=5;j++) {
//                         System.out.print("j");
//                     }
                    
//                 }
//             }
//             System.out.println();
//         }
//     }
// }


// public class pattern7 {
//     public static void main(String[] args) {
//         int n = 6;
//         for (int cols =1 ; cols <= n; cols++){
//             for(int rows = n; cols >n; rows--){
//                 System.out.print("*");

//             }
//             System.out.print("");
//         }
//     }
// }

// public class pattern7 {
//     public static void main(String[] args) {

//         // 1 to 5 stars
//         for (int i = 1; i <= 5; i++) {
//             for (int j = 1; j <= i; j++) {
//                 System.out.print("*");
//             }
//             System.out.println();
//         }

//         // 5 to 1 stars
//         for (int i = 4; i >= 1; i--) {
//             for (int j = 1; j <= i; j++) {
//                 System.out.print("*");
//             }
//             System.out.println();
//         }
//     }
// }

public class pattern7 {
    public static void main(String[] args) {
        for (int cols = 1; cols <10 ; cols++) {
            for ( int rows = 1 ; rows <= cols; rows++){
                System.out.print("*");

            }
            System.out.println();
        }

        for (int cols = 10; cols > 1; cols--) {
            for (int rows = 1; rows < cols; rows++) {
                System.out.print("*");

            }
            System.out.println();
        }
    }
}