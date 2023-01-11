public class Main {
    public static void main(String[] args) {
        Player player=new Player("oyuncu1"); // buralara parametre girersen olurdu
        Obstacle obstacle=new Obstacle();
        Game game=new Game(player,obstacle);//composition
        game.start();
    }
}
