public class ifelseif {
    public static void main(String[] args) {
        int a=10,b=87,c=43;
        boolean sart= a==b;
        /*
        String str=sart ? "Eşittir" : "Eşit Değildir";
        System.out.println(str);*/

       /*
       if(sart){
            a=20;
            System.out.println("A sayısı: "+a);
            System.out.println("Eşittir");
        }else {
            System.out.println("Değildir.");
        }
        */

        /*
        if (a<b && a<c){
            System.out.println("en küçük sayı A");
        }else if (b<a && b<c){
            System.out.println("en küçük sayı B");
        }else {
            System.out.println("en küçük sayı C");
        }
        */

        if(a<b){
            if(a<c){
                if (a==10){
                    System.out.println("A sayısı 10 a eşittir");
                }
                System.out.println("A sayısı en küçüktür");
            }else {
                System.out.println("A sayısı C den büyüktür.");
            }
        }


    }
}
