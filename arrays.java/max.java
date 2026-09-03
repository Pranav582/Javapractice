// public class max {
//     public static void main(String[] args) {
//         int arr[] = {23, 56, 78, 34, 99};
//         int max = -1;

//         for (int i = 0; i <arr.length; i++){
//             if (arr[i]>max){
//                 max = arr[i];
//             }
//         }
//         System.out.println("max: " +max );
//     }
// }

// public class max {
//     public static void main(String[] args) {
//          int arr[] = {23, 56, 78, 34, 99};
//          int max = 99;

//        for (int i = 0; i <arr.length; i++){
//              if (arr[i]<max){
//                  max = arr[i];
//             }
//          }
//          System.out.println("min : " +max );
//      }
//  }


public class max {
    public static void main(String[] args) {
         int arr[] = {23, 56, 78, 34, 99};
         //int max =0;
         //int max = -1;
         //int max = arr[0];
         //int max = arr[arr.length-1];
         //int max = arr[4];
         //int min = Integer.MIN_VALUE;
         for (int i = 0; i < arr.length; i++) {
             if (arr[i] < min) {
                 min = arr[i];
             }
         }
         System.out.println("min : " + min );
     }
 }
        
  
   