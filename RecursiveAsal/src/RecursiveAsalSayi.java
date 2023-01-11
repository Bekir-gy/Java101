import java.util.Scanner;

public class RecursiveAsalSayi {
   static int isAsal(int n,int x){
       if (x==1)//x+1==2     1 i de zaten bölüneceği için çıkarıyorum
        return 1;
       else if (x==0|| n%x==0)//x==0 sayi 1 girilmişse kontrolü ve gelen 1 eksik değeri 0 olursa bölme kontrolü
            return 0;
       else
          return isAsal(n,x-1);
    }
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.print("Sayiyi Girin:");
        int sayi=scan.nextInt();
        System.out.println(isAsal(sayi,sayi-1));
        if(isAsal(sayi,sayi-1)==1)
            System.out.println(sayi+" sayisi ASALDIR");
        else
            System.out.println(sayi+" sayisi ASAL DEĞİLDİR");







        /**Scanner scan =new Scanner(System.in);
        System.out.print("Sayiyi Giriniz:");
        int sayi=scan.nextInt();
        int counter=0;
        for (int i=sayi;i>=1;i--){
            if (sayi%i==0)
                counter++;
        }
        if (counter<=2 && sayi!=1)
            System.out.println(sayi+" Sayisi Asaldır");
       else
            System.out.println(sayi+" Sayisi Asal Değildir.");
        */
    }
}
