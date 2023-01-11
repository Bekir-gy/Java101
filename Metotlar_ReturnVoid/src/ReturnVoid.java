public class ReturnVoid {
    static int sum(int a,int b){
        int result=a+b;
        System.out.println(result);
        return result;
    }
    static void sum2(int b,int c){
        int result2 =b+c;
        System.out.println(result2);

    }

    public static void main(String[] args) {
       int sonuc=sum(5,2)+sum(3,1);
        System.out.println(sonuc);

        sum2(5,8);
    }

}
