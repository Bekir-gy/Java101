public class Fighter {

    String name;
    int health;
    int weight;

    Fighter(String name, int health,int weight){
        this.name=name;
        this.health=health;
        this.weight=weight;

    }
    int hit(Fighter foe){
        int RandomHit= (int) (Math.random()*100);
        int RandomDodge= (int) (Math.random()*100);
        System.out.println(this.name+" ==>"+foe.name+" Dövüşçüsüne "+RandomHit+" Darbe Vurdu");
        if (RandomDodge>=RandomHit){
            System.out.println(foe.name+" Gelen Darbeyi Karşıladı..");
            System.out.println("------------------------");
            return foe.health;
        }
        if (foe.health-RandomHit>0){
            return foe.health=foe.health-RandomHit;

        }
        return 0;
    }


}
