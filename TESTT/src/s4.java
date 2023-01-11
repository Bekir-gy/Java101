import java.util.*;
import java.io.*;
public class s4 {
    public static int SimpleAdding(int num) {
        for(int i=num-1;i>=0;i--){
            num+=i;
        }
        return num;
    }
    public static void main (String[] args) {
        // keep this function call here
        Scanner s = new Scanner(System.in);
        System.out.print(SimpleAdding(Integer.parseInt(s.nextLine())));
    }
}
