public abstract class BattleLocation extends Location{
    Obstacle obstacle=new Obstacle();
        boolean tools=false;
    Player player=new Player();
    @Override
    public boolean onLocation() {
        return false;
    }

    public  BattleLocation(Obstacle obstacle){
        this.obstacle=obstacle;
    }
   public  BattleLocation(){

    }

    public void Combat(int healthy){
      //  this.obstacle.obstacleHealthy=obhealth;
        this.player.healthy=healthy;
        System.out.println(player.healthy+ "CANI:");
        System.out.println(obstacle.obstacleHealthy+ "CANI:");
        System.out.println(this.obstacle.obstacleNumber());

        for (int i=0;i< this.obstacle.obstacleNumber();i++){
            int tmpHealth=obstacle.obstacleHealthy;
            while (tmpHealth>0 && player.healthy>0 ) {
                tmpHealth -= player.damage;
                player.healthy -= obstacle.obstacleDamage;
                System.out.println(player.healthy+ "SON CANI:");
            }
        }
        if (player.healthy>0){
            System.out.println("buraya giriyorrrrrr");
            player.money+= obstacle.obstacleMoney;
            System.out.println("monnnnneyyy "+player.money);
            this.tools=true;
        }else{
            System.out.println("KAYBETTİNİZ.");
            System.out.println(player.healthy);
        }



    }
}
