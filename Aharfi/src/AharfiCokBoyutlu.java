public class AharfiCokBoyutlu {
    public static void main(String[] args) {
        int [][] Aharf=new int[6][4];
        for (int i=0; i<Aharf.length;i++){
            for (int j=0; j<Aharf[i].length;j++){
                if ((i==1&&j==1) || (i==1&&j==2) || (i==3&&j==1) || (i==3 && j==2) || (i==4&&j==1) || (i==4&&j==2) ||(i==5 && j==1) ||(i==5&&j==2)){
                    System.out.print("  ");
                }else {
                    System.out.print("* ");
                }

            }System.out.println();
        }
    }
}
