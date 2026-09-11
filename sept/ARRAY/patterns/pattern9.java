public class pattern9 {
    public static void main(String[] args) {
        char ch = 'A';
        for (int cols = 1; cols <=5; cols++){
            //char ch = 'A';
            for (int row  = 1;  row<= cols ; row++) {
              
                System.out.print(ch); 
            } 
            ch++;
             System.out.println();
           
        } 
         //ch ='F';
    for (int cols = 4; cols >= 1; cols--) {
    //     // char ch = 'A';
    for (int rows = 1; rows<=cols; rows++){
        System.out.print(ch);
       // ch--;
    }
    ch--;
    System.out.println();
    }
    
    }
}