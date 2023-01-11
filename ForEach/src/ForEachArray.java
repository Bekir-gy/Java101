import javax.swing.*;

public class ForEachArray {

    public static void main(String[] args) {
        int [] firstArray={2,3,5,6};

        for (int i:firstArray){
            System.out.print(i);
        }
        System.out.println("==========");

        int[][] secondArray={{2,5,7,9},
                {11,4,8,6}
        };
        for (int[] i:secondArray){
            for (int j:i){//ilgili satırın sütunlarını geziyoruz aşağıdaki normal yöntem gibi
               System.out.print(j+" ");
            }
                System.out.println();
        }

        for (int i=0;i< secondArray.length;i++){
            for (int j=0;j< secondArray[i].length;j++){//burada yapılan gibi ilgili satırın sütunlarını gezmek gibi
             //   System.out.print(secondArray[i][j]+" ");

            }
           // System.out.println();
        }

    }




}
