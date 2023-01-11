public class AharfiCokBoyutFarkli {
    public static void main(String[] args) {
        int[][] letterA=new int[6][4];
        for (int i=0;i<letterA.length;i++){
            for (int j=0;j<letterA[i].length;j++){
                if ((i==0 || i==2) || (j==0 || j==3))
                    System.out.print("* ");
                else
                    System.out.print("  ");
            }
            System.out.println();
        }
    }
}
