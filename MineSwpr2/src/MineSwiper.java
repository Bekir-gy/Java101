import java.util.Random;
import java.util.Scanner;

public class MineSwiper {
    int rowNumber;
    int colNumber;
    MineSwiper(/*int rowNumber,int colNumber*/){// Boş Constructor hali
      /*  this.rowNumber=rowNumber;
        this.colNumber=colNumber;*/

    }

    void run(){
        Scanner scan=new Scanner(System.in);
        boolean isLose=false;
        System.out.println("MAYIN TARLASI OYUNUNA HOŞ GELDİNİZ");
        System.out.print("Satir Sayisi Giriniz:");
        int satir=scan.nextInt();

        System.out.print("Sütun Sayisi Giriniz:");
        int sutun=scan.nextInt();

        String [][] MineSwpr=new String[satir][sutun];
        for (int i=0;i<MineSwpr.length;i++){
            for (int j=0;j<MineSwpr[i].length;j++){
                MineSwpr[i][j]="-";
            }
        }

        int mayinSayisi=(satir*sutun)/4;
        String [][] Mayinlar=new String[satir][sutun];

        for (int i=0;i<Mayinlar.length;i++){
            for (int j=0; j<Mayinlar[i].length;j++){
                Mayinlar[i][j]="-";
            }
        }
        for (int i=0;i<mayinSayisi;i++){
            Random rnd=new Random();
            int row= rnd.nextInt(satir);
            int col=rnd.nextInt(sutun);
            if (Mayinlar[row][col].equals("*")){
                i--;
                continue;
            }
            Mayinlar[row][col]="*";
        }



        for (String [] ss:Mayinlar){
            for (String cc:ss){
                System.out.print(cc);
            }
            System.out.println();
        }
        System.out.println();
        System.out.println();
        int hak=(satir*sutun)-mayinSayisi;
        // int mayinTotal=0; fonksiyon olunca gerek kalmıyor

        for (int change=0;change<hak;change++){
            for (String [] row2:MineSwpr ){
                for (String col2:row2){
                    System.out.print(col2);
                }
                System.out.println();
            }
            System.out.print("Hamle Yapacağınız Satir:");
            int hamleRow=scan.nextInt();
            System.out.print("Hamle Yapacağınız Sütun:");
            int hamleCol=scan.nextInt();
            System.out.println("=======================");
            if (hamleRow>=satir || hamleCol>=sutun || hamleRow<0 || hamleCol<0){
                System.out.println("Satir ve Sütun Aralığında Değer Giriniz");
                change--;
                continue;
            }
            if (!(MineSwpr[hamleRow][hamleCol].equals("-"))){
                System.out.println("Daha ÖNCE GİRİLEN HAMLE YAPILAMAZ");
                change--;
                continue;
            }
            if (Mayinlar[hamleRow][hamleCol].equals("*")){
                System.out.println("GAME OVER");
                MineSwpr[hamleRow][hamleCol]="*";
                for (String [] x:MineSwpr){
                    for (String y:x){
                        System.out.print(y);
                    }
                    System.out.println();
                }
                isLose=true;
                break;
            }else {
                MineSwpr[hamleRow][hamleCol]=String.valueOf(MayinCount(Mayinlar,hamleCol,hamleRow,sutun,satir));
                /*if (hamleCol+1<sutun && Mayinlar[hamleRow][hamleCol+1].equals("*"))//sağ
                    mayinTotal++;
                if (hamleCol-1>=0 && Mayinlar[hamleRow][hamleCol-1].equals("*"))//sol
                    mayinTotal++;
                if (hamleRow+1<satir && Mayinlar[hamleRow+1][hamleCol].equals("*"))//alt
                    mayinTotal++;
                if (hamleRow-1>=0 && Mayinlar[hamleRow-1][hamleCol].equals("*"))//üst
                    mayinTotal++;
                if ((hamleRow-1>=0 && hamleCol-1>=0) && Mayinlar[hamleRow-1][hamleCol-1].equals("*"))//sol üst çapraz
                    mayinTotal++;
                if ((hamleRow-1>=0 && hamleCol+1<sutun) && Mayinlar[hamleRow-1][hamleCol+1].equals("*"))//sağ üst çapraz
                    mayinTotal++;
                if ((hamleRow+1<satir && hamleCol-1>=0) && Mayinlar[hamleRow+1][hamleCol-1].equals("*"))//sol alt çapraz
                    mayinTotal++;
                if ((hamleRow+1<satir && hamleCol+1<sutun) && Mayinlar[hamleRow+1][hamleCol+1].equals("*"))//sağ alt çapraz
                    mayinTotal++;*/
            }
           /* MineSwpr[hamleRow][hamleCol]=String.valueOf(mayinTotal);
            mayinTotal=0;*/ //fonksiyon olunca gerek kalmıyor
        }
        if (!isLose) {
            System.out.println("KAZANDINIZ TEBRİKLER");
            for (String [] lastRow:MineSwpr){
                for (String lastCol: lastRow){
                    if (lastCol.equals("-")){
                        lastCol="*";
                    }
                    System.out.print(lastCol);
                }
                System.out.println();
            }
        }

    }

    int MayinCount(String [][] mayin,int hamleCol, int hamleRow,int sutun, int satir){
        int mayinTotal=0;
        if (hamleCol+1<sutun && mayin[hamleRow][hamleCol+1].equals("*"))//sağ
            mayinTotal++;
        if (hamleCol-1>=0 && mayin[hamleRow][hamleCol-1].equals("*"))//sol
            mayinTotal++;
        if (hamleRow+1<satir && mayin[hamleRow+1][hamleCol].equals("*"))//alt
            mayinTotal++;
        if (hamleRow-1>=0 && mayin[hamleRow-1][hamleCol].equals("*"))//üst
            mayinTotal++;
        if ((hamleRow-1>=0 && hamleCol-1>=0) && mayin[hamleRow-1][hamleCol-1].equals("*"))//sol üst çapraz
            mayinTotal++;
        if ((hamleRow-1>=0 && hamleCol+1<sutun) && mayin[hamleRow-1][hamleCol+1].equals("*"))//sağ üst çapraz
            mayinTotal++;
        if ((hamleRow+1<satir && hamleCol-1>=0) && mayin[hamleRow+1][hamleCol-1].equals("*"))//sol alt çapraz
            mayinTotal++;
        if ((hamleRow+1<satir && hamleCol+1<sutun) && mayin[hamleRow+1][hamleCol+1].equals("*"))//sağ alt çapraz
            mayinTotal++;

        return mayinTotal;
    }

}
