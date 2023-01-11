public class Main {
    public static void main(String[] args) {
        Car audi=new Car("Audi","Blue",40);
        audi.increaseSpeed(50);
        audi.printS();
       /* audi.model="Audi";
        audi.type="Sedan";
        audi.speed=50;
        audi.increaseSpeed(50);
        audi.printSpeed();
        System.out.println(audi.model +" Hızınız:"+audi.speed +audi.color);*/

        Car bmw=new Car("BMW","RED",70);
        bmw.increaseSpeed(100);
        bmw.increaseSpeed(20);
        bmw.decreaseSpeed(20);
        bmw.printS();
        /*bmw.model  ="BMW";
        bmw.type="Sedan";
        bmw.speed=40;*/

        Car mercedes=new Car("Mercedes","yellow",60);
        //mercedes.model="Mercedes";

        Car Ww = new Car();
        //Ww.model="Ww";
    }
}
