public class Inventory {
    boolean water=false;
    boolean food;
    boolean freewood;
    String weaponName;
    String armorName;
    int weaponDamage;
    int armorDefence;
    BattleLocation bt;
    ToolStore iToolStore;

    public Inventory(ToolStore iToolStore,BattleLocation bt){
        this.weaponName=iToolStore.weaponName;
        this.weaponDamage=iToolStore.weaponDamage;
        this.armorName=iToolStore.armorName;
        this.armorDefence=iToolStore.armorDefence;
        if (bt.tools){
            this.water=true;
        }
    }
    public void showw(){
        System.out.println(this.armorName+"\n" +
                this.armorDefence+"\n" +
                this.weaponDamage+"\n" +
                this.weaponName);

    }

}
