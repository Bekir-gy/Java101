public class Match {
    Fighter f1;
    Fighter f2;
    int minWeight;
    int maxWeight;

    Match (Fighter f1,Fighter f2, int minWeight, int maxWeight){
        this.f1=f1;
        this.f2=f2;
        this.minWeight=minWeight;
        this.maxWeight=maxWeight;

    }
     void run(){
        if (isCheck()){
            while (this.f1.health>0 && this.f2.health>0){
                //System.out.println(isStartChange());
                if (isStartChange()>0.5){
                    System.out.println("=========== Yeni Raund'a "+this.f1.name+" Başlıyor =======");
                    this.f2.health=this.f1.hit(this.f2);
                    System.out.println(this.f2.name+" Dövüşçünün Kalan GÜCÜ: "+this.f2.health);
                    if (isWin())
                        break;

                    this.f1.health=this.f2.hit(this.f1);
                    System.out.println(this.f1.name+" Dövüşçünün Kalan GÜCÜ: "+this.f1.health);
                   /* if (isWin()) bu şart dışına while içine yazarsak tek sefer yazmış oluruz
                        break;*/

                }else {
                    System.out.println("=======YENİ Raund'a "+this.f2.name+" Başlıyor =========");
                    this.f1.health=this.f2.hit(this.f1);
                    System.out.println(this.f1.name+" Dövüşçüsünün KALAN GÜCÜ: "+this.f1.health);
                    if (isWin())
                        break;
                    this.f2.health=this.f1.hit(this.f2);
                    System.out.println(this.f2.name+" Dövüşçüsünün KALAN GÜCÜ: "+this.f2.health);
                   /* if (isWin()) bu şart dışına while içine yazarsak tek sefer yazmış oluruz
                        break;*/
                }
                if (isWin())
                    break;
            }

        }else {
            System.out.println("Dövüşçülerin Sikletleri Birbirine Uymuyor.");
        }
     }


     boolean isCheck(){
        return (this.f1.weight>=this.minWeight && this.f1.weight<=this.maxWeight)&&(this.f2.weight>=this.minWeight && this.f2.weight<=this.maxWeight);
    }

     double isStartChange(){
       double change=Math.random();
         System.out.println(change);
        return  change;
     }

     boolean isWin(){
        if (this.f1.health==0){
            System.out.println("KAZANAN: "+this.f2.name);
            return true;
        }
        if(this.f2.health==0){
            System.out.println("KAZANAN:"+this.f1.name);
            return true;
        }
        return false;
     }
}
