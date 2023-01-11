public class CokBoyutlu {
    public static void main(String[] args) {
       /* int [][] multi=new int[4][3];
        multi[1][1]=5;
        System.out.println(multi[1][1]);*/
         int [][] multi= {{1,2,3,4},
                           {5,7,9,8}
         };
        System.out.println(multi[1][2]);
        System.out.println(multi.length);//satır
        System.out.println(multi[0].length);// sütun

        for (int i=0;i< multi.length;i++){
            for(int j=0; j<multi[i].length;j++){
                System.out.print(multi[i][j]);
            }
            System.out.println();
        }
        int [][] multi2=new int[3][3];
        int number=1;
        for (int i=0;i< multi2.length;i++){
            for (int j=0;j<multi2[i].length;j++){
                multi2[i][j]=number++;
                System.out.print(multi2[i][j]+" ");//printler burada yazıldı
            }
            System.out.println();
        }

        // printleri burada yazılırsa buna gerek yoktur
       /* for (int i=0; i<multi2.length;i++){
            for (int j=0; j<multi2[i].length;j++){
                System.out.print(multi2[i][j]+" ");
            }
            System.out.println();
        }*/

    }

}
