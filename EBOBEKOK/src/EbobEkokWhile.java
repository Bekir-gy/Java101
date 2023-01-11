import java.util.Scanner;

public class EbobEkokWhile {
    public static void main(String[] args) {
        int sayi1,sayi2,ebob=1,ekok=1;
        Scanner scan=new Scanner(System.in);

        System.out.print("1.sayi:");
        sayi1= scan.nextInt();

        System.out.print("2.sayi:");
        sayi2= scan.nextInt();

        int i=1;
        if (sayi1<sayi2){
            while (i<=sayi1){
                if (sayi1 % i == 0 && sayi2 %i== 0) {
                    ebob=i;
                }
                i++;
            }
            System.out.println("Ebob: "+ebob);

        }else{
            while (i<=sayi2){
                if (sayi1%i==0 && sayi2%i==0){
                    ebob=i;
                }
                i++;
            }
            System.out.println("EBOB: "+ebob);
        }

        //ekok formül
        System.out.println("EKOK: "+(sayi1*sayi2)/ebob);

        //ekok formülsüz
        i=1;
        while (i<=sayi1*sayi2){
            if (i%sayi1==0 && i%sayi2==0){
                ekok=i;
                System.out.println("Ekok: "+ekok);
                break;
            }
            i++;
        }

    }
}
