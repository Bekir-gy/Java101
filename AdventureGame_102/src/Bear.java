public class Bear extends Obstacle{
    public Bear(int obstacleID, int obstacleDamage, int obstacleHealthy, int obstacleMoney){
        super(obstacleID,obstacleDamage,obstacleHealthy,obstacleMoney);
    }
    Obstacle obstacle=new Obstacle(3,7,20,12);
    

    @Override
    public int obstacleNumber() {
        return super.obstacleNumber();
    }
}
