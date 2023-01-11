import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        String letter="deneme yazısı";
        String[] text=new String[letter.length()];
        System.out.println(text.length);
        for (int i=0;i< text.length;i++){
            text[i]= String.valueOf(letter.charAt(i));
        }
        System.out.println(text[2].charAt(0));
        String text2="";
        for (int i=0;i< text.length;i++){
            if (i==0) {
                text2+=text[i].toUpperCase();
                continue;
            }
            if (text[i-1].contains(" ")){
                text2+=text[i].toUpperCase();
                continue;
            }
            text2 += text[i];
        }
        System.out.println(text2);
        System.out.println(Arrays.toString(text));

    }
}


  /* int a = 4;
        System.out.println((a >> 1)+(a << 2) );

        int x = 0, y = -2;
        System.out.println(Math.min(x,y));*/


       /* int aa = 5;
        int b = 9;
        int c = 0;
        if (aa > b) {
            c = a;
            a = b;
            b = c;
        }
        System.out.println(b + "," + aa);*/


      /*  import java.util.*;
import java.io.*;

        class Main {

            public static int FirstFactorial(int num) {
                for(int i=1;i<num;i++){
                    num=num*i;
                }
                return num;
            }

            public static void main (String[] args) {
                // keep this function call here
                Scanner s = new Scanner(System.in);
                System.out.print(FirstFactorial(s.nextLine()));
            }

        }
    }
*/


    /*import java.util.*;
import java.io.*;

    class Main {

        public static int SimpleAdding(int num) {
            for(int i=num-1;i>=0;i--){
                num+=i;
            }
            return num;
        }

        public static void main (String[] args) {
            // keep this function call here
            Scanner s = new Scanner(System.in);
            System.out.print(SimpleAdding(s.nextLine()));
        }

    }*/