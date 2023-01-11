import java.util.Scanner;

public class burclarSwitchcase {
    public static void main(String[] args) {
        int month,day;
        String burc="";
        boolean isError=false;

        Scanner scan=new Scanner(System.in);

        System.out.print("Doğduğunuz Ay:");
        month=scan.nextInt();

        System.out.print("Doğduğunuz Gün:");
        day= scan.nextInt();

        switch (month){
            case 1:
                if (day>=1 && day<=31){
                    if (day<22){
                        burc="Oğlak";
                    }else {
                        burc="Kova";
                    }
                }else {
                    isError=true;
                }
                break;
            case 2:
                if (day>=1 && day<=28){
                    if (day<20){
                        burc="Kova";
                    }else {
                        burc="Balık";
                    }
                }else {
                    isError=true;
                }
                break;
            case 3:
                if (day>=1 && day<=31){
                    if (day<21){
                        burc="Balık";
                    }else {
                        burc="Koç";
                    }
                }else {
                    isError=true;
                }
                break;

            case 4:
                if (day>=1 && day<=31){
                    if (day<21){
                        burc="Koç";
                    }else {
                        burc="Boğa";
                    }
                }else {
                    isError=true;
                }
                break;

            default:
                isError=true;
        }
        if (isError==true){
            System.out.println("Hatalı Giriş Yaptınız.");
        }else {
            System.out.println("Burcunuz "+ burc);
        }

    }
}
