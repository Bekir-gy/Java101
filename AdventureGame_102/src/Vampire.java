public class Vampire extends Obstacle{
    public Vampire(int obstacleID,int obstacleDamage, int obstacleHealthy, int obstacleMoney){
        super(obstacleID,obstacleDamage,obstacleHealthy,obstacleMoney);

    }
    Vampire vampire=new Vampire(2,4,14,7);

    @Override
    public int obstacleNumber() {
        return super.obstacleNumber();
    }
}
