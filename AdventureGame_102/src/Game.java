import java.util.Scanner;

public class Game {
    Player player;
    Location location;
    Obstacle obstacle;
    Vampire V;
    Zombie Z;
    Bear B;
    ToolStore tool=new ToolStore(); // compositon yapmayacaksan mutlaka nesne üretmelisin Toolstore tool; olmaz yani
    Forest forest=new Forest();
    Cave cave=new Cave();
    River river=new River();
    boolean devam=true;
    Scanner scan=new Scanner(System.in);
    public Game(Player player, Obstacle obstacle){//composition
        this.obstacle=obstacle;
        this.player=player;
        System.out.println(this.player.name+" oyuna başlıyor");
    }


    public void start(){
        System.out.print("KARAKTER SEÇİN:\n" +
                "1-SAMURAY\n" +
                "2-okçu\n" +
                "3-Şovalye\n" +
                "Seçim:");
        this.player.id=scan.nextInt();
        this.player.selectChar();
        while (devam) {
            System.out.println(this.player.money);
            System.out.print("Mekan Seçin:\n" +
                    "1-Normal Lokasyonu için T\n" +
                    "2-Savaş Lokasyonu için F\n" +
                    "Seçim:");
            String locChooise = scan.next();
            if (locChooise.equals("T")) {
                System.out.println("Normal Lokasyon Mekan Seçin:\n" +
                        "1-SafeHouse\n" +
                        "2-Mağaza\n" +
                        "Seçim:");
                locChooise=scan.next();
                if (locChooise.equals("1"))
                    player.healthy= player.repairHealthy;
                else {
                    tool.menu(player.money);
                    player.money = tool.player.money;
                }
                continue;
            } else {
                String DECIDE;
                if (player.healthy>0 && forest.locCounter>=1 && cave.locCounter>=1 && river.locCounter>=1){
                    System.out.print("Kazandınız. Yine de Devam etmek istiyor musunuz? Y? N?");
                    DECIDE=scan.next();
                    if (DECIDE.equals("N"))
                        break;
                }else if (player.healthy<=0){
                    System.out.println("KAYBETTİNİZ");
                    break;
                }else {

                    System.out.print("SAVAŞ MEKANI SEÇİN:\n" +
                            "1-ORMAN\n" +
                            "2-MAĞARA\n" +
                            "3-NEHİR\n" +
                            "Seçim:");
                    locChooise = scan.next();
                    if (locChooise.equals("1"))
                        forest.Combat(player.healthy);
                    else if (locChooise.equals("2"))
                        cave.Combat(player.healthy);
                    else
                        river.Combat(player.healthy);
                    continue;
                }

            }
        }

    }
}
