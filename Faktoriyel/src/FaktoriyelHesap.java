import java.util.Scanner;

public class FaktoriyelHesap {
    public static void main(String[] args) {
        int sayi,sonuc=1;
        Scanner scan=new Scanner(System.in);

        System.out.print("Faktöriyeli Alınacak sayi:");
        sayi=scan.nextInt();


        for (int i=1;i<=sayi;i++){
            sonuc=sonuc*i;
        }
        System.out.println(sayi+" sayisinin faktöriyeli "+sonuc);
    }
}
