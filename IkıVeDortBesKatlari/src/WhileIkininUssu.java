import java.util.Scanner;

public class WhileIkininUssu {
    public static void main(String[] args) {
        int sayi,i=1;
        Scanner scan=new Scanner(System.in);

        System.out.print("Sayiyi Giriniz:");
        sayi= scan.nextInt();
        while (i<=sayi){
            System.out.println("2nin Usleri:"+i);
            i*=2;
        }


       /**
        * do while
        * do {
            System.out.println("2NİN usleri:"+i);
            i*=2;
        }while (i<=sayi);*/
    }
}
