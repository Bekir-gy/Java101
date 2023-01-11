public class Main {
    public static void main(String[] args) {
        Car audi=new Car();
        audi.model="Audi";
        audi.type="Sports";
        audi.speed=30;
        //System.out.println(audi.model+" Hızınız:"+audi.speed);
        audi.increaseSpeed(30);
        audi.printSpeed();

        Car bmw=new Car();
        bmw.model="BMW";
        bmw.type="Sedan";
        bmw.speed=40;
        //System.out.println(bmw.model+" Hızınız:"+bmw.speed);
        bmw.increaseSpeed(80);
        bmw.decreaseSpeed(30);
        bmw.printSpeed();

        Car mercedes=new Car();
        mercedes.model="Mercedes";
        mercedes.type="Sports";
        mercedes.speed=20;
        mercedes.increaseSpeed(10);
        mercedes.increaseSpeed(45);
        mercedes.decreaseSpeed(20);
       // System.out.println(mercedes.model+" Hızınız:"+mercedes.speed );
        mercedes.printSpeed();

        Car Ww=new Car();
        Ww.model="ww";
        Ww.type="Sedan";
        Ww.speed=25;
        Ww.increaseSpeed(80);
        Ww.increaseSpeed(70);
        Ww.increaseSpeed(50);//artmaz 180 şart var
        //System.out.println(Ww.model+ " Hızınız:"+Ww.speed);
        Ww.printSpeed();


    }
}
