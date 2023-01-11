public class s2 {
    public static void main(String[] args) {
        int aa = 5;
        int b = 9;
        int c = 0;
        if (aa > b) {
            c = aa;
            aa = b;
            b = c;
        }
        System.out.println(b + "," + aa);
    }
}
