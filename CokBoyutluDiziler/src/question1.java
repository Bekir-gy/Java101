import java.util.Scanner;

public class question1 {
    public static void main(String[] args) {
        int [][] MultiArray=new int[3][4];

        Scanner scan=new Scanner(System.in);
        for (int i=0; i<MultiArray.length; i++){
            for (int j=0; j<MultiArray[i].length;j++){
                System.out.print("Matrisin "+(i+1)+".satır "+(j+1)+" sütun değerini girin:");
                int deger=scan.nextInt();
                MultiArray[i][j]=deger;
            }
        }

        System.out.println("=========Oluşan Matris============");
        for (int i=0; i<MultiArray.length;i++){
            for (int j=0;j<MultiArray[i].length;j++){
                System.out.print(MultiArray[i][j]+" ");
            }
            System.out.println();
        }
    }
}
