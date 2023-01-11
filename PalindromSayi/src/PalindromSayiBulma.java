public class PalindromSayiBulma {
    static boolean isPalindrom(int sayi){
        int temp=sayi,reserveNumber=0,lastNumber;
        while (temp!=0){
            System.out.println("Sayi:"+temp);
            lastNumber=temp%10;
            System.out.println("Son Rakam: "+lastNumber);
            reserveNumber=(reserveNumber*10)+lastNumber;
            System.out.println("Yeni Sayi: "+reserveNumber);
            temp/=10;
            System.out.println("Yeni TEMP:"+temp);
            System.out.println("==========");

        }

        if (sayi==reserveNumber)
            return true;
        else
            return false;

    }


    public static void main(String[] args) {
        System.out.println(isPalindrom(8));
    }
}
