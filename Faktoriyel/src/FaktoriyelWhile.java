import java.util.Scanner;

public class FaktoriyelWhile {
    public static void main(String[] args) {
        int sayi,i=1,sonuc=1;
        Scanner scan= new Scanner(System.in);

        System.out.print("Sayiyi Giriniz:");
        sayi=scan.nextInt();
        while (i<=sayi){
            sonuc=sonuc*i;
            i++;
        }
        System.out.println(sayi+" sayisinin Faktöriyeli:"+sonuc);
    }
}
