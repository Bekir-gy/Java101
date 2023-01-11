public class Obstacle {
   public int obstacleID;
    int obstacleDamage;
    int obstacleHealthy;
    int obstacleMoney;

    public Obstacle(){

    }

    public Obstacle(int obstacleID,int obstacleDamage,int obstacleHealthy,int obstacleMoney){
        this.obstacleID=obstacleID;
        this.obstacleDamage=obstacleDamage;
        this.obstacleHealthy=obstacleHealthy;
        this.obstacleMoney=obstacleMoney;
    }
    public int obstacleNumber(){
        return (int)(Math.random()*3);
    }
}
