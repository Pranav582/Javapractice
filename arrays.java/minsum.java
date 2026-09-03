// public class minsum {
//     public static void main(String[] args) {
        
//         int a[] = {1, 2, 3, 5, 4, 8, 9, 10};
//         int s = 3;

//         int min = Integer.MAX_VALUE;

//         for (int i = 0; i <= a.length - s; i++) {
//             int sum = 0;

//             for (int j = i; j < i + s; j++) {
//                 System.out.print(a[j] + " ");a
//                 sum += a[j];
//             }

//             System.out.println(" = " + sum);

//             if (sum < min) {
//                 min = sum;
//             }
//         }

//         System.out.println("Minimum sum = " + min);
//     }
// }
    

// public class minsum {
//     public static void main(String[] args) {
//         int a[] = {1, 2, 3, 4, 5, 6, 7};
//         int k = 3;

//         int index = 0;
//         int min = Integer.MAX_VALUE;

//         for (int i = 0; i <= a.length - k; i++) {
//             int sum = 0;

//             for (int j = i; j < i + k; j++) {
//                 System.out.print(a[j] + " ");
//                 sum = sum + a[j];
//             }

//             System.out.println(" = " + sum + " start index " + i);

//             if (sum < min) {
//                 min = sum;
//                 index = i;
//             }
//         }

//         System.out.println("min = " + min + " at index " + index);
//         System.out.println("avg min = " + (min / k));
//     }
// }

// public class minsum {
// 	public static void main(String[] args) {
// 		//remove duplicate 1st way
// 		int a[]= {11,222,11};
// 		for(int i=0;i<a.length;i++)
// 		{
// 			int c=0;
// 			for(int j=i+1;j<a.length;j++)
// 			{
// 			if(a[i]==a[j])
// 			{
// 				c++;
// 			}
// 		}
// 		if(c==0)
// 		{
// 			System.out.println(a[i]);
// 		}
		
// 	}
// 	}
// }
// public class minsum {
// 	public static void main(String[] args) {
		
// 		int a[]= {1,2,3,2,1}; //
// 		for(int i=0;i<a.length;i++) 
// 		{
// 			int c=0;
// 			for(int j=i+1;j<a.length;j++)//1>3,2>3,3<3=f
// 			{
// 			if(a[i]==a[j])//1==1t, 1==2, 1==3f
// 			{
// 				c++;//0//1
// 			}
// 		}
// 		if(c==0)
// 		{
// 			System.out.println(a[i]);
// 		}
		
// 	}
// 	}
// }

// public class minsum {
// 	public static void main(String[] args) {
// 		int a[]= {1,2,3,2,1};//
// 		for (int i=0;i<a.length;i++)//0<5 1<5 2<5 3<5 4<5 5<5F
// 		{
// 			int c=0;
// 			for (int j=i+1;j<a.length;j++)//1<5T 2<5T 3<5T 4<5T 5<5F
// //				                            2<5T 3<5T 4<5T 5<5F
// //                                          3<5T 4<5T 5<5F
// //				                            4<5T 5<5F
// //				                            5<5F
// 			{
// 				if (a[i]==a[j])// 1==2F 1==3F 1==2f 1==1T
// //					              2==3F 2==2T
// //					              3==2F 3==1F
// //					              2==1F
// 				{
// 					c++;//1 //1 //0 //0 //0
// 				}
// 			}
// 			if (c==0)//1==0F 1==0F 0==0T 0==0T 0==0T
// 			{
// 				System.out.println(a[i]+ " " );
// 			}
// 		}
// 	}
// }

// public class minsum {
//     public static void main(String[] args) {
//         int arr[]={1,3,1};
//         for(int i=0;i<arr.length;i++){//0<3=t ,1<3=t, 2<3=t, 3<3=f
//             int c=0;
//             for(int j=0;j<i;j++){//0<0 =f , 0<1 = t, 0<2
                                 
                
//                 if(arr[i]==arr[j]){//3==1=f//1==1=t
//                     c++;//1
//                 }
//             }
//             if(c==0){//0=0=t,0=0t,1=0 f
//                 System.out.println(a[i]+" "+i);//1//3
                                             
//             }
//         }
//     }
    
// }

// public class minsum{
//    public static void main(String[] args) {
//         int a[]={1,2,3,1};
//         int index=0;
//         int b[]=new int[a.length];
//         for(int i=0;i<a.length;i++){
//             int c=0;
//             for(int j=i+1;j<a.length;j++){
//                 if(a[i]==a[j]){     
//                     c++;
//                 }   
//             }
//             if(c==0){
//                 b[index]=a[i];
//                 index++;    
//                 }
//         }
//         for(int i=0;i<index;i++){
//             System.out.println(b[i]+" "+i);
//         }
//     }
// }

	
	public class minsum {
		public static void main(String [] args) {
			int a[] = {1,2,3,2,1};
			int k=0;
			for(int i=0; i<a.length; i++)
			{
				int c=0;
				for(int j=i+1; j<a.length; j++) { 
	
					if(a[i]==a[j]) {    		
						c++; 
					}
				}
				if(c==0) { 
					k++;
				}
			}
			int b[] = new int[k];
			k=0;
			for(int i=0; i<a.length; i++)
			{
				int c=0;
				for(int j=i+1; j<a.length; j++) { 
	
					if(a[i]==a[j]) {    		
						c++; 
					}
				}
				if(c==0) { 
					b[k++]=a[i];
				}
			}
			for(int i=0; i<b.length; i++) {
				System.out.println(b[i]);
			}
		}
	}https://github.com/Pranav582/javapractice.git