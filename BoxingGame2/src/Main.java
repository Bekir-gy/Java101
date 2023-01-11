public class Main {
    public static void main(String[] args) {
        Fighter fighter1=new Fighter("A",15,100,105,50);
        Fighter fighter2=new Fighter("B",20,100,100,35);
        Match m1=new Match(fighter1,fighter2,100,110);
        m1.run();
    }
}
