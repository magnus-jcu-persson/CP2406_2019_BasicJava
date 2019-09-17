package week7;

public class SugarSmashPlayer {
    private Integer playerID;
    private String screenName;
    Integer[] highScores = new Integer[10];

    public Integer getPlayerID() {
        return playerID;
    }

    public void setPlayerID(Integer playerID) {
        this.playerID = playerID;
    }

    public String getScreenName() {
        return screenName;
    }

    public void setScreenName(String screenName) {
        this.screenName = screenName;
    }

    public Integer getHighScore(Integer level) {
        return highScores[level];
    }

    public void setHighScore(Integer level, Integer score) throws Exception {
        if (level > (this.highScores.length - 1)) {
            throw new ArrayIndexOutOfBoundsException("Incorrect level");
        }
        for (Integer i = level-1; i >= 0; i--) {
            if (this.highScores[i] == null || this.highScores[i] < 100) {
                throw new Exception("Level " + i + " not complete");
            }
        }
        this.highScores[level] = score;
    }
}
