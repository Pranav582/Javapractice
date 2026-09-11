//sum total of an array

public class sumtotal {
    public static void main(String[] args) {
        int arr[] = {3,5,6,8,9,23};
        int sum = 0;
       // int n = arr.length;

        for (int i = 0; i<=arr.length-1; i++){
            //System.out.println(arr[i]);
            //int value = arr[i];
             sum = sum + arr[i];
        }
        System.out.println("The sum is : "+ sum);
    }
}