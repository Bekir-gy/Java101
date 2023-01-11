public class Fighter {
    String name;
    int damage;
    int health;
    int weight;
    int dodge;


    Fighter(String name, int  damage, int health, int weight, int dodge){
        this.name=name;
        this.damage=damage;
        this.health=health;
        this.weight=weight;
        if (dodge>=0 && dodge<=100) {
            this.dodge = dodge;
        }
        else {
            this.dodge=0;
        }

    }

    int hit(Fighter foe){
            System.out.println(this.name+" => "+foe.name+"'ye "+this.damage+" hasar vurdu");
            if (foe.isDodge()){
                System.out.println(foe.name+" Gelen Hasarı Karşıladı");
                System.out.println("-----------------");
                return foe.health;
            }

        if (foe.health-this.damage>0 )
            return foe.health = foe.health - this.damage;

        return 0;
    }

    boolean isDodge(){
        double RandomNumber=Math.random()*100;
        return this.dodge > RandomNumber;


    }
}
