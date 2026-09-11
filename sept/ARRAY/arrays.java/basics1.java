// public class basics1 {
//     public static void main(String[] args) {
//         int marks1 = 23;
//         int marks2 = 45;
//         int marks3 = 69;
//         int marks4 = 13;
//         int marks5= 78;
//         int a[] = {marks1, marks2, marks3, marks4, marks5};

//         // System.out.println(a[0]);
//         //  System.out.println(a[1]);
//         //   System.out.println(a[2]);
//         //    System.out.println(a[3]);
//         //     System.out.println(a[4]);

//         for (int i = 0; i < a.length; i++) {
//             System.out.println(a[i]);
//         }
//     }
// }

import java.util.Scanner;

public class basics1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Size:");
		int n = sc.nextInt();
		int[] arr = new int[n];

		System.out.println("Enter Elements:");
		for (int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}

		for (int i = 0; i < n; i++) {
			//System.out.println(arr[i] + " " + i);
            System.err.println(arr[i] + " " + i);
		}

		
	}
}

// public class basics1 {
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


// Rx8!Am872