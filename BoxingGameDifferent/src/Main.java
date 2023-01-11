public class Main {
    public static void main(String[] args) {
        Fighter figter1=new Fighter("A",100,110);
        Fighter fighter2= new Fighter("B",100,100);
        Match m1=new Match(figter1,fighter2,100,110);
        m1.run();

    }
}
