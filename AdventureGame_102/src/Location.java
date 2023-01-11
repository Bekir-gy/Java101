public abstract class Location {
    Player player=new Player();
    String name;
    public Location(){
        //System.out.println(player.getMoney());

    /*
    public Location(Player player){
    this.player=player;  OLSAYDI AŞAĞIDAKİ AÇIKLAMA GEÇERLİ

     */
        //composition yapmamızı istiyor yoksa içi boş yapabiliriz ve tüm alt sınıflarda constructor oluituruğ super
        //dememize gerek kalmaz toolstore için özellikle çünkü player money bilgisi için Player player=new player(); diyip
        //erişebilirdik ama burada Location Constructorında Player player olduğu için yani composition yaptığımızdan
        //tool store da constructor oluşturduk super demek zorundayız
    }
    public abstract boolean onLocation();
}
