public class TransposeTEKRAR {
    public static void main(String[] args) {
        int [][] matris=new int[2][3];
        matris[0][0]=1;
        matris[0][1]=2;
        matris[0][2]=3;
        matris[1][0]=4;
        matris[1][1]=5;
        matris[1][2]=6;

        for (int [] row:matris){
            for (int col: row){
                System.out.print(col+" ");
            }
            System.out.println();
        }
        System.out.println();
        int [] [] transpose=new int[3][2];
        for (int i=0;i< matris.length;i++){
            for (int j=0;j< matris[i].length;j++){
                transpose[j][i]=matris[i][j];
            }
        }
        for (int [] roww:transpose){
            for (int coll: roww){
                System.out.print(coll+" ");
            }
            System.out.println();
        }
    }
}
