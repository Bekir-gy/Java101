public class River extends BattleLocation{
    int locCounter=0;

    public River(Bear bear){
        super(bear);
    }// lOCATİON 8.satırdaki açıklama olsaydı bu açıklalma
    /*
    public River(Bear Bear ,Player Player ){
        super(bear,player);
    }
     */
    // Locationdaki composition yüzünden fazladan player alıyor
   public River(){

    }

    @Override
    public void Combat(int healthy) {
        super.Combat(healthy);
        this.locCounter++;
    }
}
