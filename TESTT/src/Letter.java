import java.util.Scanner;

public class Letter {
    static String LetterR(String str){
        String [] text=new String[str.length()];
        for (int i=0; i< text.length;i++){
            text[i]= String.valueOf(str.charAt(i));
        }
        String text2="";
        for (int i=0;i< text.length;i++){
            if (i==0 && text[i].equals(" ")){// if(i==0)sadece olursa başa bırakılan boşluğu outputa yazar olduğu gibi
                while ((text[i].equals(" "))){// başa bırakılan boşluk olursa outputa onları almıyor
                    i++;}
                text2+=text[i].toUpperCase();
                continue;
            }
            if (text[i-1].equals(" ")){
                text2+=text[i].toUpperCase();
                continue;
            }
            text2+=text[i];
        }
        return text2;
    }


    public static void main(String[] args) {
        System.out.print("Metin Giriniz:");
        Scanner scan=new Scanner(System.in);
        System.out.println(LetterR(scan.nextLine()));
    }
}
