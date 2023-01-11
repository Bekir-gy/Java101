public class Cave extends BattleLocation{
   int locCounter=0;
    public Cave(Zombie zombie){
        super(zombie);
    }// lOCATİON 8.satırdaki açıklama olsaydı bu açıklalma
    /*
    public Cave(Zombie zombie ,Player Player ){
        super(zombie,player);
    }
     */
    // Locationdaki composition yüzünden fazladan player alıyor

        public Cave(){


        }
    @Override
    public void Combat(int healthy) {
        super.Combat(healthy);
        this.locCounter++;
    }
}
