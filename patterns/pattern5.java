public class pattern5 {
    public static void main(String[] args) {
        int n = 10;
        for (int cols = n; cols >0; cols--) {
            for (int rows = 1; rows <= cols; rows++) {
                System.out.print("  *");
            }
            System.out.println();
            
        }
      
    }
}