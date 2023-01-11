public class MantıksalOp {
    public static void main(String[] args) {
        int a=10,b=10,c=5,d;
        boolean kosul1= a<b;
        boolean kosul2= a>c;
        boolean sonuc= kosul1 || kosul2;

        System.out.println(kosul1 && kosul2);
        System.out.println(!sonuc);

        d=(a==b) ? 5:7;
        System.out.println(d);

       // boolean olmadan da mümkün
        System.out.println(a<b || a>c);




    }
}
