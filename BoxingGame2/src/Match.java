public class Match {
    Fighter f1;
    Fighter f2;
    int minWeight;
    int maxWeight;

    Match(Fighter f1, Fighter f2, int minWeight, int maxWeight){
        this.f1=f1;
        this.f2=f2;
        this.minWeight=minWeight;
        this.maxWeight=maxWeight;

    }

    void run(){
        if (isCheck()){
            if (isStartBegin()>=50){
                while (this.f1.health>0 && this.f2.health>0) {
                    System.out.println("=======Yeni Raund======");

                    this.f2.health = this.f1.hit(this.f2);
                    System.out.println(this.f2.name + " Dövüşçüsünün kalan gücü:" + this.f2.health);
                    if (isWin()){
                        break;
                    }
                    this.f1.health=this.f2.hit(f1);
                    System.out.println(this.f1.name+" Dövüşçüsünün kalan gücü:"+this.f1.health);
                    if (isWin()){
                        break;
                    }
                }
            }else {
                while (this.f1.health>0 && this.f2.health>0) {
                    System.out.println("=======Yeni Raund======");

                    this.f1.health = this.f2.hit(this.f1);
                    System.out.println(this.f1.name + " Dövüşçüsünün kalan gücü:" + this.f1.health);
                    if (isWin()){
                        break;
                    }
                    this.f2.health=this.f1.hit(f2);
                    System.out.println(this.f2.name+" Dövüşçüsünün kalan gücü:"+this.f2.health);
                    if (isWin()){
                        break;
                    }
                }

            }



        }else {
            System.out.println("DÖVÜŞÇÜLERİN SİKLETLERİ BİRBİRNE UYMUYOR");
        }

    }


    boolean isCheck(){
        return (this.f1.weight>=this.minWeight && this.f1.weight<=this.maxWeight)&&(this.f2.weight>=this.minWeight && this.f2.weight<=this.maxWeight);
    }

    boolean isWin(){
        if (this.f1.health==0){
            System.out.println("Kazanan:"+this.f2.name);
            return true;
        }
        if (this.f2.health==0){
            System.out.println("Kazanan:"+this.f1.name);
            return true;
        }
        return false;
    }

    double isStartBegin(){
        double RandomStart=Math.random()*100;
        System.out.println("KİMİN BAŞLIYACAĞI SONUCU:"+RandomStart);
        return RandomStart;

    }

}
