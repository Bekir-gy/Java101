import java.util.Scanner;

public class FibonacciHesap {
    public static void main(String[] args) {
        int sayi,total=0,n1=0,n2=1;
        Scanner scan=new Scanner(System.in);
        System.out.print("Kaç Elemanlı Olsun:");
        sayi=scan.nextInt();
        System.out.print(n1+" "+n2+" ");
        for (int i=2; i<=sayi;i++){
            total=n1+n2;
            System.out.print(total+" ");
            n1=n2;
            n2=total;

        }





    }
}
