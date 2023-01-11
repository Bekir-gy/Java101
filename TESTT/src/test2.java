import java.util.*;
import java.io.*;

    class test2 {

        public static String LetterCapitalize(String str) {
            //str= str.toUpperCase();
            String text="";
            String [] letter=new String [str.length()];
            /*for(int i=0;i<letter.length;i++){
                letter[i]= String.valueOf(str.charAt(i));
            }*/
            for(int i=0;i<str.length();i++){
                if(i==0){
                    letter[i]= String.valueOf(str.charAt(i));
                    //letter[i]=str.charAt(i);
                    letter[i]=letter[i].toUpperCase();
                    text+=letter[i];
                    continue;
                }if(str.contains(" ")){
                    letter[i]= String.valueOf(str.charAt(i));
                    text+=letter[i].toUpperCase();
                   /* str.charAt(i+1);*/
                   // text+=str.charAt(i);
                    continue;
                }
                text+=str.charAt(i);

            }
            return text;
        }

        public static void main (String[] args) {
            // keep this function call here
            Scanner s = new Scanner(System.in);
            System.out.print(LetterCapitalize(s.nextLine()));
        }

    }

/*

Letter Capitalize
Have the function LetterCapitalize(str) take the str parameter being passed and capitalize the first letter of each word. Words will be separated by only one space.
Examples
Input: "hello world"
Output: Hello World
Input: "i ran there"
Output: I Ran There
 */