public class BharfiCokBoyutlu {
    public static void main(String[] args) {
        int [][] bLetter= new int[7][4];
        for (int i=0;i<bLetter.length; i++){
            for (int j=0;j<bLetter[i].length;j++){
                if ((i==0 || i==3 || i==6) || (j==0 || j==3))
                    System.out.print("* ");
                else
                    System.out.print("  ");
            }
            System.out.println();
        }
    }
}
