class  One{



    byte  add( byte a ,byte b){
    return (byte)(a + b);

}
   String div(short a, short b){
    return  "the div is: "+(a/b);
   }

}
public class aug14{
    public static void main(String[] args) {
        One ac= new One();
      byte w =  ac.add( (byte ) 3,(byte)4);
      One bc = new One();
      String p = bc.div( (short)12, 13);
      System.out.println(p);

        System.out.println(w );


    }




}

