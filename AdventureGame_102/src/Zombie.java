public class Zombie extends Obstacle{
    public Zombie(int obstacleID,int obstacleDamage,int obstacleHealthy,int obstacleMoney){
        super(obstacleID,obstacleDamage,obstacleHealthy,obstacleMoney);
    }
    Obstacle obstacle=new Obstacle(1,3,10,4);

    @Override
    public int obstacleNumber() {
        return super.obstacleNumber();
    }
}
