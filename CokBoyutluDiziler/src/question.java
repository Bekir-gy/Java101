public class question {
    public static void main(String[] args) {
        int MultiArray[][]=new int[3][4];
        for (int i=0; i<MultiArray.length;i++){
            for (int j=0; j<MultiArray[i].length;j++){
                MultiArray[i][j]= (int) (Math.random()*100);
                System.out.print(MultiArray[i][j]+" ");
            }
            System.out.println();
        }
    }
}
