// public class copy {
//     public static void main(String[] args) {
//         int a[]= {1, 2, 3, 4, 5};
//         int b[]=new int[a.length];
//         for (int i=0; i<a.length; i++){
//            b[i]= a[i];
//               System.out.println(b[i]+ " " +i);
//         }
//     }
// }

// public class copy {
//     public static void main(String[] args) {
//         //copy even elements from array
//         int a[] = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
//         int c[] = new int[a.length]
//          if (a%2==0)
//     }
// }
// package array;

// public class Pract14 {
// 	public static void main(String[] args) {
// 		int arr[]= {1,2,3,4,5,6,7,8,9,10};
// 		int[] even = new int[5];
// 		int j=0;
// 		for(int i=0 ;i<arr.length; i++) {
// 			if(arr[i]%2==0) {
// 				even[j++]=arr[i];
// 			}
// 		}
// 		for(int i=0 ;i<even.length; i++) {
// 			System.out.println(even[i]);
// 		}
// 	}
// }

public class copy {
	public static void main(String[] args) {
		int arr[]= {1,2,3,4,5,6};
		int ele=0;
		for(int i=0 ;i<arr.length; i++) {

			if(arr[i]%2==0) {
				ele++;
			}
		}

		int[]arr1 = new int[ele];
		int index=0;
		for(int i=0 ;i<arr.length; i++) {

			if(arr[i]%2==0) {
				arr1[index]=arr[i];
				index++;
			}
		}

		System.out.println("Even number : ");
		for(int i=0 ;i<arr1.length; i++) {
			System.out.println(arr1[i]+"  "+i);
		}
	}
}