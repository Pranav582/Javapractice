// public class fact {
//     public static void main(String[] args) {
//         int arr[]={1,2,3,4,5,6,7,8,9,10};
//         for(int i=0;i<arr.length;i++){
//             if(arr[i]%2==0){
//            int fact=1;
//            for(int k=1;k<=arr[i];k++){
//             fact=fact*k;
//            }
//            System.out.println(arr[i]+"="+fact);

//              }
             
//         }
      
//     }
    
// }

// public class fact {
//     public static void main(String[] args) {
//         int arr[] ={2,4,6,8};
//         int element = 4;
//         int c = 0;

//         for (int i = 0; i < arr.length; i++) {
//             if (arr[i] == element) {
//                 c++;
//             }
//         }

//         if (c == 0) {
//             System.out.println("notfound");
//         } else {
//             System.out.println("found");
//         }
//     }
// }


//remove given element

public class fact {
    public static void main(String[] args) {
        int arr[] = {1, 2, 3, 4, 5, 6, 7};
        int element = 5;
        int c = 0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == element) {
                c++;
            }
        }

        if (c == 0) {
            System.out.println("Element not found");
        } else {
            System.out.println("Remaining elements:");
            for (int i = 0; i < arr.length; i++) {
                if (arr[i] != element) {
                    System.out.print(arr[i] + " " );
                }
            }
        }
    }
}

