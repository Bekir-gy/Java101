import java.util.Scanner;

public class HavaSicaklik {
    public static void main(String[] args){
     int heat;

        Scanner scan=new Scanner(System.in);
        System.out.print("Hava Sıcaklığı Giriniz:");
        heat=scan.nextInt();

        //Video Çözüm
        if (heat<5){
            System.out.println("Kayağa Gidiniz:");
        }else if (heat>=5 && heat<=25){
            if (heat<=15){
                System.out.println("Sinemaya Gidiniz.");
            }
            if (heat>=10){
                System.out.println("Pikniğe Gidiniz");
            }
        }else{
            System.out.println("Yüzmeye Gidiniz");
        }



       /**
        * Benim Çözümüm

        if (heat<5){
            System.out.println("Kayağa Gidiniz");
        }
        else if(heat>=10 && heat<=15){
            System.out.println("Sinemaya Gidiniz\nPikniğe Gidiniz");
        }
        else if (heat <15){
            System.out.println("Sinemaya Gidiniz");
        }else if (heat<=25){
            System.out.println("Pikniğe Gidiniz");
        }
        else {
            System.out.println("Yüzmeye Gidiniz");
        }
*/
       /* 5-15 15-25 arası ise
       if (heat<5){
            System.out.println("Kayağa Gidiniz");
        }else if (heat <15){
            System.out.println("Sinemaya Gidiniz");
        }else if (heat>15 && heat<=25){
            System.out.println("Pikniğe Gidiniz");
        }else if(heat==15){
            System.out.println("Sinemaya Gidiniz\nPikniğe Gidiniz");

        }
        else {
            System.out.println("Yüzmeye Gidiniz");
        }
*/


    }
}
