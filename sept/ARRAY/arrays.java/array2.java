// public class array2 {
//     public static void main(String[] args) {
//         int arr[]= {1,2,3,4,5,6,7,8,9};
//         int k=3;
//         for(int i=0;i<arr.length-(k-1);i++){
//             for(int j=i;j<k+i;j++){
//                 System.out.print(arr[j]+" ");
//             }
//             System.out.println();
//         }
//     }
// }


//sum of pair

public class array2 {
    public static void main(String[] args) {
        int arr[] = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        int k = 4;

        for (int i = 0; i <= arr.length - k; i++) {
            int sum = 0;

            for (int j = i; j < i + k; j++) {
                System.out.print(arr[j] + " ");
                sum += arr[j];
            }

            System.out.println("= " + sum);
        }
    }
}
    
