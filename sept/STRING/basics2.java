// public class basics2 {
//     public static void main(String[] args) {
//         int arr[5];
//         int num = 0;
//         arr = new int[5];
//         for (int i = 1 ; i<5; i++){
//             num += arr[i];
         
//         }
//          System.out.println(arr);
//     }
// }

public class basics2 {
    public static void main(String[] args) {
        // int arr[]= {5,3,1,6,2};
        // int val =0;
        // val = arr[0];

        // for (int i = 1 ; i<arr.length; i++){
        //     if (val<arr[i])
        //     val = arr[i];
        // }

        // int arr[];
        // int num = 0;
        // arr = {};
        //  for (int i = 0 ; i< 5; i++){
        //     num += arr[i];
        //  }
      //  System.out.println(val);

       String arr[][] ={{"asdfghj"},{"asdfg"},{"qwert"}
    //     {1,2,3},
    //     {1,2},
    //     {1,2,3}
      };
      for (int i = 0; i<arr.length; i++ ){
        for (int j =0; j<arr[i].length; j++){
            System.out.print(arr[i][j]+" ");
        }
        System.out.println();
      }
    }
}