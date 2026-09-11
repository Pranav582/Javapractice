public class array1{
    public static void main(String[] args) {
        int arr[]= {1,2,3,4,5};
        int k =3;

        for(int i = 0; i<arr.length-(k-1); i++){
            System.out.println(arr[i]+" " + arr[i+1]+ " " + arr[i+2]);
        }
    }
}