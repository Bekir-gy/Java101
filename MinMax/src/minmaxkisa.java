import java.util.Scanner;

public class minmaxkisa {
    public static void main(String[] args) {
        int miktar,sayi,min=0,max=0;
        Scanner scan=new Scanner(System.in);

        System.out.print("Kaç Adet Sayi Gireceksiniz:");
        miktar=scan.nextInt();

        for (int i=1;i<=miktar;i++){
            System.out.print(i+".Sayiyi Girin:");
            sayi=scan.nextInt();
            if (sayi>max){
                max=sayi;
            }

            if (min>=sayi || min==0){//min>=sayi
                min=sayi;
            }
        }
        System.out.println("EN KÜÇÜK:"+min);
        System.out.println("EN Büyük Sayi:"+max);
    }
}
