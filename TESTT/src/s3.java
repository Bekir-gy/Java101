import java.util.*;
import java.io.*;
public class s3 {
     static int FirstFactorial(int num) {
         int sonuc=1;
        for(int i=num-1;i>=1;i--){
            num=num*i;
            System.out.println(num);
        }
        return num;
    }

    public static void main(String[] args) {
            // keep this function call here
            Scanner s = new Scanner(System.in);
            System.out.print(FirstFactorial(s.nextInt()));

    }
}
