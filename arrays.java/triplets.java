public class triplets {
    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5,6,7,8,9,10,11,12};

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                for (int k = j + 1; k < arr.length; k++) {
                    for (int l = k + 1; l < arr.length; l++) {
                        System.out.println(arr[i] + ":" + arr[j] + ":" + arr[k] + ":" + arr[l]);
                    }
                }
            }
        }
    }
}