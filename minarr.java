// min arr of java

public class minarr {
    public static void main(String[] args) {
        int arr[] = {3,5,6,8,9,9,1};
        int min = arr[0];
        
        for (int i = 0 ; i<=arr.length-1; i++){
            if (arr[i]<min)
            min=arr[i];
        }
        System.out.println("minumim array is: " + min);
    }
}