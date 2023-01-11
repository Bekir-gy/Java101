import java.util.Scanner;

public class Kombinasyon {
    public static void main(String[] args) {
        int eleman,alteleman,n=1,r=1,nEksiR=1,nRfarki;
        double Kombinasyon;
        Scanner scan=new Scanner(System.in);

        System.out.print("Kaçın Kombinasyonu C(N,r) N:");
        eleman=scan.nextInt();

        System.out.print("Kaçlı Kombinasyonu C(N,r) r:");
        alteleman=scan.nextInt();

        for (int i=1;i<=eleman;i++){
            n=n*i;
        }
        for (int i=1;i<=alteleman;i++){
            r=r*i;
        }

        nRfarki=eleman-alteleman;
        for (int i=1;i<=nRfarki;i++){
            nEksiR=nEksiR*i;
        }

        Kombinasyon=n/(r*nEksiR);
        System.out.println(eleman+" in "+alteleman+" li Kombinasyonu:"+Kombinasyon);

    }
}
