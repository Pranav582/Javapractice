
//     public static void main(String[] args) {
//         //by new keyword
//         //used when we have datafrom another
//         int a[] =new int[5];

//         a[0]= 23;
//         a[1]= 267;
//         a[2]= 57;
//         a[3]= 235;
//         a[4]= 45;

//         for (int i = 0; i < a.length; i++){
//             System.out.println( a[i]+" "+ i);
//         }
//     }
// }

// public class prac{
//     public static void main(String[] args) {
//         int[] arr = {2, 4, 5, 6, 8, 5, 23, 4};

//         // for (int i = 0; i < arr.length - 1; i++) {
//         //     System.out.println(i + " " + arr);
//         // }
//         int n = arr.length;
//         for(int val: arr){
//             System.out.println(val);
//         }
        
//     }
    
// }


// public class prac {
//     public static void main(String[] args) {
//         int arr[]= {5, 4, 6, 8, 9, 2};
//         int sum = 0;
//         int n = arr.length;

//        // Scanner sc = new Scanner(System.in);
//       //  int i = sc.nextInt();
//       for (int i = 0; i<arr.length-1; i++){
//       int value = arr[i];
//       sum = sum + value;
//       }
//      System.out.println(sum);

//     }
// }

// public class prac {
//     public static void main(String[] args) {
//         int arr[] ={1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

//         for (int i =0; i<arr.length; i++) {
//             if (arr[i]%2==0){
//                 System.out.println(arr[i]);
//             }

//         }
//         for (int i=0;i<arr.length;i++) 
// 		{
//             if (arr[i]%2!=0) 
// 			{
//                 System.out.println(arr[i]);
// 			}
// 		}
		

// 	}
//     }

// public class prac {
// 	public static void main(String[] args) {
// 		int arr[] = {1,2,3,4,5,6,7,8,9,10};
// 		int arr1[] = new int[arr.length];
// 		int j=0;
// 		for(int i=0; i<arr.length; i++) {
// 			if(arr[i]%2==0) {
// 				arr1[j++]=arr[i];
// 			}
// 		}
// 		for(int i=0; i<arr.length; i++) {
// 			if(arr[i]%2!=0) {
// 				arr1[j++]=arr[i];			
// 				}
// 		}
		
// 		for(int i=0; i<arr.length; i++) {
// 			System.out.println(arr1[i]);
// 		}
// 	}
// }
// class prac {
//     public static void main(String[] args) {
//         int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
//         int[] arr1 = new int[arr.length];
//         int index = 0;

//         for (int i = 0; i < arr.length; i++) {
//             if (arr[i] % 2 == 0) {
//                 arr1[index] = arr[i];
//                 index++;
//             }
//         }

//         for (int i = 0; i < arr.length; i++) {
//             if (arr[i] % 2 != 0) {
//                 arr1[index] = arr[i];
//                 index++;
//             }
//         }

//         System.out.println("arr1 array:");
//         for (int i = 0; i < arr1.length; i++) {
//             System.out.println(arr1[i] + " " + i);
//         }
//     }
// }


// class prac {
//     public static void main(String[] args) {
//         int arr[] = {4, -6, 9, -1, 5, 7, -2};
//         // print negative before positive

//         int[] arr1 = new int[arr.length];
//         int index = 0;

//         for (int i = 0; i < arr.length; i++) {
//             if (arr[i] < 0) {
//                 arr1[index] = arr[i];
//                 index++;
//             }
//         }

//         for (int i = 0; i < arr.length; i++) {
//             if (arr[i] >= 0) {
//                 arr1[index] = arr[i];
//                 index++;
//             }
//         }

//         System.out.println("Negative numbers first:");
//         for (int i = 0; i < arr1.length; i++) {
//             System.out.print(arr1[i] + " ");
//         }
//         System.out.println();
//     }
// }

public class prac {
    public static void main(String[] args) {
        //replace zeroes to one
        int a[] = {0,1,0,1,0,1,0,1,0,1};

        for (int i =0; i<a.length; i++){
            if (a[i]==0){
                a[i]=1;
            }
            System.out.println(a[i]);
        }
    }
}