import java.util.Arrays;
import java.util.Scanner;

public class PalindromKlm {
    static boolean isPalindrome(String str){
        int i=0;
        int j=str.length()-1;
        while (i<j){
            if (str.charAt(i)!=str.charAt(j))
                return false;
            i++;
            j--;
        }
        return true;
    }

    static boolean isPalindrome2(String str){
        String word="";
        for (int i=str.length()-1;i>=0;i--){
            word+=str.charAt(i);
        }
        return str.equals(word);
    }

    public static void main(String[] args) {
        System.out.print("Kelimeyi Giriniz:");
        Scanner scan=new Scanner(System.in);
        String word=scan.nextLine();
        System.out.println(isPalindrome2(word));
    }
}
