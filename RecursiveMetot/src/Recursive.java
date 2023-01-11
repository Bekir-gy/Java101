public class Recursive {
    /**
     *
     * recursive olmadan
     */
    static int m(int x){
        int result=0;
        for (int i=1; i<=x;i++){
            result+=i;
        }
        return  result;
    }

    /**
     *recursive
     */
    static int f(int n){
       System.out.println(n);
        if (n==1)
            return 1;
        int result=f(n-1) + n;
        System.out.println("result:  "+result);
        return result;
    }

    public static void main(String[] args) {
        System.out.println(f(3));
    }
}
