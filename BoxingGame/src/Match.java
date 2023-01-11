public class Match {
    Fighter f1;
    Fighter f2;
    int maxWeight;
    int minWeight;

    Match(Fighter f1, Fighter f2,int maxWeight, int minWeight){
        this.f1=f1;
        this.f2=f2;
        this.maxWeight=maxWeight;
        this.minWeight=minWeight;
    }

    void run(){
        if (isCheck()){
            while (this.f1.health>0 && this.f2.health>0){
                System.out.println("======Yeni Raund========");

                this.f2.health=this.f1.hit(this.f2);
                System.out.println(this.f2.name+" Dövüşçüsünün Kalan Gücü:"+this.f2.health);
                if (isWinner()) {
                    break;
                }
                this.f1.health=this.f2.hit(this.f1);
                System.out.println(this.f1.name+" Dövüşçüsünün Kalan Gücü:"+this.f1.health);
                if (isWinner()) {
                    break;
                }



            }

        }else {
            System.out.println("Dövüşçülerin Sikletleri Birbirine UYMUYOR");
        }
    }

    boolean isCheck(){
        return (this.f1.weight>=this.minWeight && this.f1.weight<=this.maxWeight) &&(this.f2.weight>=this.minWeight && this.f2.weight<=this.maxWeight);

    }

    boolean isWinner(){
        if (this.f1.health==0) {
            System.out.println("Kazanan:" + this.f2.name);
            return true;
        }
        if (this.f2.health==0) {
            System.out.println("Kazanan:" + this.f1.name);
            return  true;
        }
        return false;
    }
}
