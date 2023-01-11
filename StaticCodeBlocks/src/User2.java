public class User2 {
    public String name;
    public static int counter;

    static {
        System.out.println("2-Static kod bloğu çalıştı.");
        counter=(int)( Math.random()*10);
        System.out.println("3-Varsayılan counter:"+counter);
    }
    public User2(String name){
        this.name=name;
        counter++;
        System.out.println("counter yeni deger:"+counter);
    }

}
