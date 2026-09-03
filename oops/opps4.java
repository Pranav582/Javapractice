//methods -> predefined  aready defined
     //     -> userdefined - passed by an programmer

class test{
    void get(){
        System.out.println("a");
    }
    void show(){
        System.out.println("get");
    }

    void show(int num){
        System.out.println("get " + num);
    }

    public static void main(String[] args) {
        test t1= new test();
        t1.get();
        t1.show();
        t1.show(1);
        t1.show(2);

    }


}
