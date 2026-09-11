


public class pattern6 {
    public static void main(String[] args) {
        int n = 10;
        for (int cols = 1; cols <=n; cols++){
            for (int rows = 1 ; rows<= cols ; rows++ )
            System.out.print("*");
            
            System.out.println();
            for ( int c = n; c >=n; c--){
                for (int r = 1 ; r<= n-c ; r++ )
                System.out.print("*");
                
                System.out.println();
            
        }
    }
}
}