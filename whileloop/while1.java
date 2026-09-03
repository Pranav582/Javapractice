public class while1 {
    public static void main(String[] args)
     {
        int n = 1234;
        int rem;
       // int c;

        if (n > 0){
            System.out.println("positive");
            int c;
            while (n>0)
            {
                rem = n%10; //4
                if (rem%2==0)//0f
                {
                    System.out.println(rem);
                    // primr
                    c = 0;

                    for (int i = 1; i<=rem; i++)
                    {
                        if (n%i==0)
                        {
                            c++;
                        }
                    }
                    if (c ==2)
                    {
                        System.out.println("is an prime no: " + rem);
                    }
                }
                n = n/10;
            }
        } else if (n <0){
            System.out.println("negative");
        }else {
            System.out.println("zero");
        }
        
    }
}




// int num=12345;
// 		int rem;
// 		if(num>0) {
// 			System.out.println("Positive");
// 			while(num>0)
// 			{
// 				rem = num%10;
// 				if(rem%2==0) 
// 				{
// 					System.out.println(rem);
// 					//prime
// 					int c=0;
// 					for(int i=1;i<=rem;i++)
// 					{
// 						if(rem%i==0)
// 						{
// 							c++;
// 						}
// 					}
// 					if(c==2)
// 					{
// 						System.out.println("Prime = " + rem);
// 					}
// 				}
// 				num = num/10;
// 			}
// 		}
// 		else if(num<0)
// 		{
// 			System.out.println("Negative");
// 		}
// 		else
// 		{
// 			System.out.println("zero");
// 		}

        
//     }
// }