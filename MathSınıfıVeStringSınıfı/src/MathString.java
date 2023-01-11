public class MathString {
    public static void main(String[] args) {
        System.out.println((int) (Math.random()*10));
        System.out.println(Math.round(Math.random()*10));
        System.out.println(Math.round(1.4));

        double sayi=  (Math.random()*100);
        System.out.println(sayi);

        System.out.println((int)sayi);
        System.out.println(Math.round(sayi));
        System.out.println();
        System.out.println();

        String str="patika   ";
        System.out.println(str.charAt(2));
        System.out.println(str.toLowerCase());
        System.out.println(str.toUpperCase());
        System.out.println(str.trim());
        System.out.println(str.startsWith("pa"));
    }
}
