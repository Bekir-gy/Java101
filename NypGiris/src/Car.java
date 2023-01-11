public class Car {
    String type="FirstType";
    String model;
    String color;
    int speed;
    int speedLimit=180;

    void increaseSpeed(int increament){
        if ((increament+speed) < speedLimit){
            speed+=increament;
        }
    }

    void decreaseSpeed(int decrease){
        if (speed>0){
            speed-=decrease;
        }
    }

    void printSpeed(){
        System.out.println(model+" Hızınız: "+speed);
    }
}
