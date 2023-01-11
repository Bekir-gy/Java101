public class SafeHouse extends NormalLocation{
    @Override
    public boolean onLocation() {
        Player player=new Player();
        player.healthy= player.repairHealthy;
        return super.onLocation();
    }
}
