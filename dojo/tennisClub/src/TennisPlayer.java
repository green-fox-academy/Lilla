public class TennisPlayer {

  private int matchScore = 0;
  private String name;

  public TennisPlayer() {
  }

  public TennisPlayer(String name) {
    this.name = name;
  }

  public int getMatchScore() {
    return matchScore;
  }

  public void setMatchScore(int matchScore) {
    this.matchScore = matchScore;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }


  public void wonPoint() {
    matchScore += 1;
  }

  public String scoreToString() {
    String scoreToString;
    if (matchScore == 0) {
      scoreToString = "Love";
    } else if (matchScore == 1) {
      scoreToString = "Fifteen";
    } else if (matchScore == 2) {
      scoreToString = "Thirty";
    } else {
      scoreToString = "Forty";
    }
    return scoreToString;
  }
}











