public class Forest extends BattleLocation{
    int locCounter=0;
    public Forest(Vampire vampire){
        super(vampire);
    } // lOCATİON 8.satırdaki açıklama olsaydı bu açıklalma
    /*
    public River(Vampire vampire ,Player Player ){
        super(Vampire,player);
    }
     */
    // Locationdaki composition yüzünden fazladan player alıyor
  public Forest (){


  }
    @Override
    public void Combat(int healthy ) {
        super.Combat(healthy);
        this.locCounter++;
    }
}
