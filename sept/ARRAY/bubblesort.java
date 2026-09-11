// public class bubblesort {
//     public static void main(String[] args) {
//         int arr[]={5,4,3,2,1};//5,4,3,2,1
//         for(int i=0;i<arr.length;i++){//0 1 2 3 4
//             for(int j=i+1;j<arr.length;j++){//1 2 3 4 5 =F
//                 if(arr[i]>arr[j]){
//                     //5>4=T 5>3=T 5>2=T 5>1
//                     //          4>3=T 4>2=T 4>1=T
//                     //          3>2=T 3>1=T
//                     //          2>1=T
                              
//                    //index
//                     // 0 1 2 3 4
//                     //4 5 3 2 1
//                     //4 3 5 2 1
//                     //4 3 2 5 1
//                     //4 3 2 1 5
                    
//                     //index
//                     //0 1 2 3 4
//                     //3 4 2 1 5
//                     //3 2 4 1 5
//                     //3 2 1 4* 5
                    
//                     //index
//                     //0 1 2 3 4
//                     //2 3 1 4 5
//                     //2 1 3* 4 5
//                     //1* 2* 3 4 5
//                  int temp=arr[i];
//                    arr[i]=arr[j];
//                    arr[j]=temp;
                    

//                 }
//             }
           
//             }
//              System.out.println("Sorted array:");
//             for(int i=0;i<arr.length;i++){
//                 System.out.println(arr[i]);//1 2 3 4 5

            
            
//         }
//     }
    
// } 



public class bubblesort {
    public static void main(String[] args) {
        int arr[] = {23, 24, 2, 67, 78, 1, 3};

        for (int i = 0; i<=arr.length-2; i++){
            for (int j = i+1; j<arr.length; j++){
                if (arr[i]>arr[j]){
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        System.out.println("strted arrays = ");
        for (int i =0 ; i<=arr.length; i++){
            System.out.println(arr[i]);
        }
    }
}