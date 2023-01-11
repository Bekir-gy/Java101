public class Main {
    public static void main(String[] args) {
        Fighter fighter1=new Fighter("A",10,100,120,70);
        Fighter fighter2=new Fighter("B",20,100,90,45);
        Match m1=new Match(fighter1,fighter2,120,85);
        m1.run();

    }
}
