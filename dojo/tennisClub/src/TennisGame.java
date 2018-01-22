public class TennisGame {

  TennisPlayer player1 = new TennisPlayer("Federer");
  TennisPlayer player2 = new TennisPlayer("Fucsovics");
  public String matchCurrentResult;

  public TennisGame() {
  }

  public TennisGame(TennisPlayer player1, TennisPlayer player2) {
    this.player1 = player1;
    this.player2 = player2;
  }

  public String matchToString() {
    if (player1.getMatchScore() == player2.getMatchScore()) {
      if (player1.getMatchScore() > 4) {
        matchCurrentResult = "Deuce";
      } else {
        return player1.scoreToString() + " - All";
      }
    } else if (player1.getMatchScore() >= 4 || player2.getMatchScore() >= 4) {
      int scoreDifference = player1.getMatchScore() - player2.getMatchScore();
      if (scoreDifference == 1) {
        return "Advantage " + player1.getName();
      } else if (scoreDifference == -1) {
        matchCurrentResult = "Advantage " + player2.getName();
      } else if (scoreDifference >= 2) {
        matchCurrentResult = "Win for " + player1.getName();
      } else {
        matchCurrentResult = "Win for " + player2.getName();
      }
    } else {
      matchCurrentResult = player1.scoreToString() + " - " + player2.scoreToString();
    }
    return matchCurrentResult;
  }
}

