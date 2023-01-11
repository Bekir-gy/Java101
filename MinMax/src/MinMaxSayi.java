import java.util.Scanner;

public class MinMaxSayi {
    public static void main(String[] args) {
        int miktar,sayi,min=0,max=0,temp=0,min2=0;
        Scanner scan=new Scanner(System.in);
        System.out.print("Kaç Adet Sayi Gireceksiniz:");
        miktar=scan.nextInt();
        for (int i=1;i<=miktar;i++){
            System.out.print(i+".Sayiyi Girin:");
            sayi=scan.nextInt();
            if (sayi>max){
                max=sayi;
            }
            if (min>=sayi){
                min2=sayi;
            }else {
                if (temp>=sayi ||temp==0)
                temp = sayi;
            }
            min=sayi;
        }
        if (min2<temp)
            System.out.println("EN KÜÇÜK:"+min2);
        else
            System.out.println("EN KÜÇÜK:"+temp);

        System.out.println("EN Büyük Sayi:"+max);
        System.out.println(min2);
    }
}
