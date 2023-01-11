public class User {
    public String name;
    public static int counter;

    static {
        System.out.println("2-STATİC KOD BLOĞU ÇALIŞTI--------");
        System.out.println("ben bir static kod bloğuyum");
        counter=(int)( Math.random()*10);
        System.out.println("3-Varsayılan counter değeri:"+counter);

    }

    public User(String name){
        this.name=name;
        counter++;
        System.out.println("COUNTER YENİ DEĞER:"+counter);
    }

}
