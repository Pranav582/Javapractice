//find maximum array in java

public class maxarr {
    public static void main(String[] args) {
        int arr[] ={3,2,-5,21,10};
        int max =arr[0];

        for (int i  =0 ; i< arr.length; i++){
           
                if (max<arr[i])
                max =arr[i];
               
            }
             System.out.println(max);
        }
    }
