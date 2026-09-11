public class array2d {
    public static void main(String[] args) {
        int arr[][] ={{1,2,3},
                      {4,5,6},
                      {7,8,9}};

                      int rowLength = arr.length;
                      int colLength = arr[0].length;

                      for (int rowIndex = 0; rowIndex<=arr.length-1; rowIndex++ ){
                        for (int colIndex = 0; colIndex <=arr.length-1; rowIndex++){
                            System.out.println(arr[rowIndex][colIndex] + " ");
                        }
                      }
    }
}