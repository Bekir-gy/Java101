import java.util.Scanner;

public class Burclarif {
    public static void main(String[] args) {
        int month,day;
        boolean isError=false;
        Scanner scan= new Scanner(System.in);

        System.out.print("Ayı giriniz:");
        month=scan.nextInt();

        System.out.print("Günü Giriniz:");
        day= scan.nextInt();

        if (month==1) {
            if (day >= 1 && day <= 31) {
                if (day <= 21) {
                    System.out.println("Burcunuz Oğlak: " + day + "." + month);
                } else {
                    System.out.println("Burcunuz Kova: " + day + "." + month);
                }
            }else {
                isError=true;
            }
        }
        else if (month==2){
            if (day>=1 && day<=28) {
                if (day <= 19) {
                    System.out.println("Burcunuz Kova: " + day + "." + month);
                } else {
                    System.out.println("Burcunuz Balık: " + day + "." + month);
                }
            }else {
                isError=true;
            }
        }
        else if (month==3){
            if(day>=1 && day<=31) {
                if (day <= 20) {
                    System.out.println("Burcunuz Balık: " + day + "." + month);
                } else {
                    System.out.println("Burcunuz Koç: " + day + "." + month);
                }
            }else {
                isError=true;
            }
        }
        else if (month==4){
            if (day>=1 && day<=31) {
                if (day <= 20) {
                    System.out.println("Burcunuz Koç: " + day + "." + month);
                } else {
                    System.out.println("Burcunuz Boğa: " + day + "." + month);
                }
            }else {
                isError=true;
            }
        }
        else if (month==5){
            if (day>=1 && day<=31) {
                if (day <= 21) {
                    System.out.println("Burcunuz Boğa: " + day + "." + month);
                } else {
                    System.out.println("Burcunuz İkizler: " + day + "." + month);
                }
            }else {
                isError=true;
            }
        }
        else if (month==6){
            if (day>=1 && day<=31) {
                if (day <= 22) {
                    System.out.println("Burcunuz İkizler: " + day + "." + month);
                } else {
                    System.out.println("Burcunuz Yengeç: " + day + "." + month);
                }
            }else {
                isError=true;
            }
        }
        else if (month==7){
            if (day>=1 && day<=31) {
                if (day <= 22) {
                    System.out.println("Burcunuz Yengeç: " + day + "." + month);
                } else {
                    System.out.println("Burcunuz Aslan: " + day + "." + month);
                }
            }else {
                isError=true;
            }
        }
        else if (month==8){
            if (day>=1 && day<=31) {
                if (day <= 22) {
                    System.out.println("Burcunuz Aslan: " + day + "." + month);
                } else {
                    System.out.println("Burcunuz Başak: " + day + "." + month);
                }
            }else {
                isError=true;
            }
        }
        else if (month==9){
            if (day>=1 && day<=31) {
                if (day <= 22) {
                    System.out.println("Burcunuz Başak: " + day + "." + month);
                } else {
                    System.out.println("Burcunuz Terazi: " + day + "." + month);
                }
            }else {
                isError=true;
            }
        }
        else if (month==10){
            if (day>=1 && day<=31) {
                if (day <= 22) {
                    System.out.println("Burcunuz Terazi: " + day + "." + month);
                } else {
                    System.out.println("Burcunuz Akrep: " + day + "." + month);
                }
            }else {
                isError=true;
            }
        }
        else if (month==11){
            if (day>=1 && day<=31) {
                if (day <= 21) {
                    System.out.println("Burcunuz Akrep: " + day + "." + month);
                } else {
                    System.out.println("Burcunuz Yay: " + day + "." + month);
                }
            }else {
                isError=true;
            }
        }
        else if (month==12){
            if (day>=1 && day<=31) {
                if (day <= 21) {
                    System.out.println("Burcunuz Yay: " + day + "." + month);
                } else {
                    System.out.println("Burcunuz Oğlak: " + day + "." + month);
                }
            }else {
                isError=true;
            }
        }
        else {
                System.out.println("Hatalı Ay Girdiniz.");
        }

        if (isError==true)
            System.out.println("Hatalı Giriş Yaptınız.");

    }
}
