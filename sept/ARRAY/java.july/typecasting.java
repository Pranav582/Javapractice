public class typecasting {
    public static void main (String[] args){
        //widening

        // double  n2 =  50;
        // float  k2= (int)n2;

        // System.out.println(n2);

        //*if we convert from int to boolean it is not possible*

        //char

        // char ch = 'a';
        // int c = ch;
        // System.out.println("c");
        
        // int c2 = 85;
        // char ch2 = (char)c2;

        // System.out.println(ch2);

        //string >- int
        String s3 = "1000";
        int s4  = Integer.parseInt(s3);
        System.out.println(s4+5);
        String k1 = "20" ;
        String k2 = "30";
        System.out.println(k1+k2);

        int h = 50;

        String ans = String.valueOf(h);
        System.out.println(ans +10);

        //float to string

        float f = 45.78f;
        String ans2 =String.valueOf(f);

        System.out.println(ans2);










    }
}