public class Player {
    Inventory inventory;
    int damage;
    int healthy;
    int repairHealthy;
    int money;
    String name;
    int id;

    public Player(int damage, int healthy, int money, String name,int id){ //buna gerek yok çünkü dışarıdan bu değerleri almayacağız
        this.damage=damage; // çünkü değerler belli ve sadece karakter seçimi yaptıracağız
        this.healthy=healthy;
        this.money=money;
        this.name=name;
        this.id=id;

    }
    public Player(String name){
        this.name=name;
    } // bu constructor yeterli çünkü dışarıdan sadece isim alacağız
    public Player(){

    }
   /* public int getMoney(){
        return this.money;
    }*/
    public void selectChar(){
        switch (this.id){
            case 1:
                //this.repairHealthy=21;
                this.damage=5;
                this.healthy=21;
                this.money=15;
                break;
            case 2:
                this.damage=7;
                this.healthy=18;
                this.money=20;
                break;
            case 3:
                this.damage=8;
                this.healthy=24;
                this.money=5;
                System.out.println("oyuncu hasarı:"+this.damage+" oyuncu parası:"+this.money);
                break;
            default:
                System.out.println("Invalid CHARACTER SELECTED!");
        }
       // this.repairHealthy=this.healthy;
        System.out.println(this.money);
    }

}
