public class MetotKonusu {
    static int power(int taban,int us){
        int result =1;
        for (int i=1;i<=us;i++){
            result*=taban;
        }
        return result;
    }

    static void hello(){
        System.out.println("Merhaba Patika");
    }
    public static void main(String[] args) {
        System.out.println(power(2,3));
        int sonuc=power(4,2);
        System.out.println(sonuc);
        hello();
        hello();
        hello();

    }
}
