public class Car {
    String type;
    String model="TEST";// ilk yazdırıldığında burayı yazdıracağını göstermek için burada tanımlandı
    String color;
    int speed;
    int SpeedLimit;

    Car(String model,String color,int speed){
        System.out.println(this.model);//this genel sınıfı ifade eder
        this.model=model;//gelen değeri genel sınıfın niteliğine yani değişkenine atar
        this.color=color;
        this.type="Sedan";// içerde tanımlamak daha iyi olur
        this.speed=speed;
        this.SpeedLimit=180;

        System.out.println("DOLU METOT");
    }
    Car(){
        System.out.println("Boş Metot");
    }

    void increaseSpeed(int increament){
        if (increament+this.speed<this.SpeedLimit){
            this.speed+=increament;
        }
    }
    void decreaseSpeed(int decrease){
        if (this.speed>0){
            this.speed-=decrease;
        }
    }

    void printSpeed(){
        System.out.println(this.model+" Hızınız: "+this.speed);
    }

    void printS(){
        System.out.println("Model\t:"+this.model);
        System.out.println("Color\t:"+ this.color);
        System.out.println("Type\t:"+this.type);
        System.out.println("Speed\t:"+ this.speed);
        System.out.println("============");

    }

}
