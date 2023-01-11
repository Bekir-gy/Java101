import java.util.Scanner;

public class ToolStore extends  NormalLocation{
    int weaponID;
    int weaponDamage;
    int weaponPrice;
    String weaponName="";

    int armorID;
    int armorDefence;
    int armorPrice;
    String armorName;

    Player player=new Player();
    int toolSelect;
    Scanner scan=new Scanner(System.in);
    @Override
    public boolean onLocation() {
        return super.onLocation();
    }
    /*public ToolStore(){
        super();

    }*/
    public void  menu(int money){
        this.player.money=money;
        System.out.println(player.money);
        System.out.println("SİLAH VE ZIRH SEÇİM EKRANI\n" +
                "1-SİLAHLAR\n" +
                "2-ZIRHLAR");

        System.out.print("Seçim Yapınız:");
        this.toolSelect=scan.nextInt();
        switch (this.toolSelect){
            case 1:
                System.out.println("SİLAHLAR MENÜSÜ:\n" +
                        "1-Tabanca Hasar:2 Para:25\n" +
                        "2-Kılıç Hasar:3 Para:35\n" +
                        "3-Tüfek Hasar:7 Para:45");
                System.out.print("Silah Seçiminiz:");
                this.weaponID=scan.nextInt();
                switch (this.weaponID){
                    case 1:
                        this.weaponDamage=2;
                        this.weaponPrice=25;
                        if (player.money>=this.weaponPrice) {
                            this.player.money -= this.weaponPrice;
                            player.damage+=weaponDamage;
                            this.weaponName="Tabanca";
                            buy();
                        }
                        else
                            System.out.println("Bakiyeniz yetersiz. Bakiyeniz:"+this.player.money);
                        break;
                    case 2:
                        this.weaponDamage=3;
                        this.weaponPrice=35;
                        if (player.money>=this.weaponPrice) {
                            player.money -= this.weaponPrice;
                            player.damage+=weaponDamage;
                            this.weaponName="Kılıç";
                            buy();
                        }
                        else
                            System.out.println("Bakiyeniz yetersiz. Bakiyeniz:"+player.money);
                        break;
                    case 3:
                        this.weaponDamage=7;
                        this.weaponPrice=45;
                        if (player.money>=this.weaponPrice) {
                            player.money -= this.weaponPrice;
                            player.damage+=weaponDamage;
                            this.weaponName="Tüfek";
                            buy();
                        }
                        else
                            System.out.println("Bakiyeniz yetersiz. Bakiyeniz:"+this.player.money);
                        break;
                    default:
                        System.out.println("Geçersiz Silah Seçimi!");
                }
                break;
            case 2:
                System.out.println("ZIRHLAR MENÜSÜ:\n" +
                        "1-HAFİF ENGELLEME:1 Para:15\n" +
                        "2-ORTA ENGELLEME:3 Para:25\n" +
                        "3-AĞIR ENGELLEME:5 Para:40");
                System.out.print("ZIRH Seçiminiz:");
                this.armorID=scan.nextInt();
                switch (this.armorID){
                    case 1:
                        this.armorDefence=1;
                        this.armorPrice=15;
                        if (player.money>=this.armorPrice) {
                            player.money -= this.armorPrice;
                            player.healthy+=armorDefence;
                            this.armorName="HAFİF";
                            buy();
                        }
                        else
                            System.out.println("Bakiyeniz yetersiz. Bakiyeniz:"+player.money);
                        break;
                    case 2:
                        this.armorDefence=3;
                        this.armorPrice=25;
                        if (player.money>=this.armorPrice) {
                            player.money -= this.armorPrice;
                            player.healthy+=armorDefence;
                            this.armorName="ORTA";
                            buy();
                        }
                        else
                            System.out.println("Bakiyeniz yetersiz. Bakiyeniz:"+player.money);
                        break;
                    case 3:
                        this.armorDefence=5;
                        this.armorPrice=40;
                        if (player.money>=this.armorPrice) {
                            player.money -= this.armorPrice;
                            player.healthy+=armorDefence;
                            this.armorName="AĞIR";
                            buy();
                        }
                        else
                            System.out.println("Bakiyeniz yetersiz. Bakiyeniz:"+player.money);
                        break;
                    default:
                        System.out.println("Geçersiz Zırh Seçimi!");
                }
                break;
            default:
                System.out.println("HATALI Silah veya Zırh SEÇİM KATEGORİ SEÇİMİ!");
        }


    }

    public void buy(){
        System.out.println("Satın alma Başarılı Kalan Bakiyeniz:"+player.money);

    }
}
