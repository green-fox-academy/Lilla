public class Main {

  public static void main(String[] args) {

    TennisGame worldChampionship = new TennisGame(new TennisPlayer("Lilla"), new TennisPlayer("Bence"));
    worldChampionship.player2.wonPoint();
    worldChampionship.player2.wonPoint();
    worldChampionship.player1.wonPoint();
    worldChampionship.player1.wonPoint();

    worldChampionship.player2.wonPoint();
    worldChampionship.player1.wonPoint();
    worldChampionship.player1.wonPoint();
    worldChampionship.player2.wonPoint();

    System.out.println(worldChampionship.matchToString());
  }
}
