public class Overloading {
    static  void print(){
        System.out.println("Merhaba Patika");
    }

    static void print(int a){
        System.out.println("Parametre: "+a);
    }
    static void print(double a){
        System.out.println("Parametlreler: "+a);
    }
    static int print(int a,int b){
        System.out.println(a+b);
        return a+b;
    }
    static int print(int a,int b,int c){
        return a+b+c;
    }


    public static void main(String[] args) {
        print();
        print(8);
        print(7.0);
        System.out.println(print(5,8,7));
        System.out.println(print(5,7));
    }
}
