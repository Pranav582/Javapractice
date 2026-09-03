
// //     public static void main(String[] args) {
// //         for (int i = 0; i< 5; i++){
// //             for (int j =0 ; j<5; j ++ ){
// //                 System.out.print( " " + (i +1));
// //             }
// //             System.out.println();
// //         } 
// //     }
// // }

// public class pattern1 {
//     public static void main(String[] args) {
//         for (int i = 0; i<5; i++){
//             //System.out.println("*");
//             for (int j = 0; j<5; j++){
//                 if (i == 0 || i == 4 || j== 0 || j==4 ){
//                     System.out.print("*");
//                     //System.out.println();
//                 } else {
//                     System.out.print(" ");
//                 }
                
//             }
//             System.out.println();
//         } 
//     }
// }

public class pattern1 
{
    public static void main(String[] args)
     {
        for (int i = 0; i< 4; i++)
         {
            for (int j = 0; j<8; j++) 
            {
                //System.out.print("*");
            if (i==0 || i==3 || j==0 || j==7) 
            {
                System.out.print("*");
            } else {
                System.out.print(" ");
            }


           
        }
       System.out.println("");    
        
    }
    for (int i = 0; i< 4; i++)
         {
            for (int j = 0; j<8; j++) 
            {
                //System.out.print("*");
            if (i==0 || i==3 || j==0 || j==7) 
            {
                System.out.print("*");
            } else {
                System.out.print(" ");
            }


           
        }
        System.out.println("");    
    }

}
}