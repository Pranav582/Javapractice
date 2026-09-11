//sum total of an array

public class mularray {
    public static void main(String[] args) {
        int arr[] = {2,3,10, 20};
        int mul = 1;
       // int n = arr.length;

        for (int i = 0; i<=arr.length-1; i++){
            //System.out.println(arr[i]);
            //int value = arr[i];
             mul = mul * arr[i];
        }
        System.out.println("The sum is : "+ mul);
    }
}