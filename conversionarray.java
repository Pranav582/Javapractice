// conversion from 2d array to 1d array

public class conversionarray {
    public static void main(String[] args) {
        int arr[][] = {{1,2,3},
                       {4,5,6},
                       {7,8,9}};
int index = 0;
int b[] = new int[arr.length*arr.length];

 for (int i =0 ; i<arr.length; i++){
    for (int j = 0; j<arr.length; j++){
        b[index]=arr[i][j];
        index++;
    }

 }
 for (int i = 0; i<b.length; i++){
    System.out.println(b[i] + " " +i);
 }
    }
}