import java.util.Random;
import java.util.Scanner;

public class MineSwiper2 {
    int rowNumber;
    int colNumber;
    MineSwiper2(int rowNumber,int colNumber){
        this.rowNumber=rowNumber;
        this.colNumber=colNumber;
    }

    void run(){
        boolean isLose=false;
        System.out.println("Mayın TARLASI OYUNUNA Hoşgeldiniz");
        Scanner scan=new Scanner(System.in);
        String [][] MineSwpr=new String[this.rowNumber][this.colNumber];
        String [][] Mayinlar=new String[this.rowNumber][this.colNumber];

        for (int i=0;i<Mayinlar.length;i++){
            for (int j=0;j<Mayinlar[i].length;j++){
               Mayinlar[i][j]="-";
            }
        }

        for (int i=0;i<MineSwpr.length;i++){
            for (int j=0;j<MineSwpr[i].length;j++){
                MineSwpr[i][j]="-";
            }
        }

        int mayinSayisi=(this.rowNumber*this.colNumber)/4;
        for (int i=0;i<mayinSayisi;i++){
            Random rnd=new Random();
            int roww=rnd.nextInt(this.rowNumber);
            int coll=rnd.nextInt(this.colNumber);
            if (Mayinlar[roww][coll].equals("*")){
                i--;
                continue;
            }
            Mayinlar[roww][coll]="*";
        }
        for (String [] row:Mayinlar){
            for (String col: row){
                System.out.print(col);
            }
            System.out.println();
        }
        System.out.println();
        System.out.println();

        int hak=(this.rowNumber*this.colNumber)-mayinSayisi;
        for (int change=0;change<hak;change++){
            for (String [] row:MineSwpr){
                for (String col:row){
                    System.out.print(col);
                }
                System.out.println();
            }
            System.out.print("Hamle Yapılacak Satır:");
            int hamleRow=scan.nextInt();
            System.out.print("Hamle Yapılcak Sütun:");
            int hamleCol=scan.nextInt();
            if (hamleRow>=this.rowNumber || hamleCol>=this.colNumber || hamleRow<0 || hamleCol<0){
                System.out.println("Sınır Değerlerinde Giriş Yapınız...");
                change--;
                continue;
            }
            if (Mayinlar[hamleRow][hamleCol].equals("*")){
                System.out.println("Game Over.....");
                MineSwpr[hamleRow][hamleCol]="*";
                for (String [] row:MineSwpr){
                    for (String col:row){
                        System.out.print(col);
                    }
                    System.out.println();
                }
                isLose=true;
                break;
            }else {
                MineSwpr[hamleRow][hamleCol]=String.valueOf(MayinCount(Mayinlar,hamleRow,hamleCol,this.rowNumber,this.colNumber));

            }

        }
        if (!isLose){
            System.out.println("Tebrikler Kazandınız:");
            for (String [] row:MineSwpr){
                for (String col:row){
                    if (col.equals("-")){
                       col="*";
                    }
                    System.out.print(col);
                }
                System.out.println();
            }
        }


    }

    int MayinCount(String [][]Mayinlar,int hamleRow,int hamleCol,int satir, int sutun){
        int MayinTotal=0;
        if ((hamleCol+1<sutun)&& Mayinlar[hamleRow][hamleCol+1].equals("*")) //sağ
            MayinTotal++;
        if ((hamleCol-1>=0) && Mayinlar[hamleRow][hamleCol-1].equals("*")) // sol
            MayinTotal++;
        if ((hamleRow+1<satir) && Mayinlar[hamleRow+1][hamleCol].equals("*")) //alt
            MayinTotal++;
        if ((hamleRow-1>=0) && Mayinlar[hamleRow-1][hamleCol].equals("*"))// üst
            MayinTotal++;
        if ((hamleRow-1>=0 && hamleCol-1>=0) && Mayinlar[hamleRow-1][hamleCol-1].equals("*"))//sol üst çapraz
            MayinTotal++;
        if ((hamleRow-1>=0 && hamleCol+1<sutun) && Mayinlar[hamleRow-1][hamleCol+1].equals("*"))//sağ üst çapraz
            MayinTotal++;
        if ((hamleRow+1<satir && hamleCol+1<sutun) && Mayinlar[hamleRow+1][hamleCol+1].equals("*"))//sağ alt çağraz
            MayinTotal++;
        if ((hamleRow+1<satir && hamleCol-1>=0) && Mayinlar[hamleRow+1][hamleCol-1].equals("*"))//sol alt çapraz
            MayinTotal++;

        return MayinTotal;
    }
}
