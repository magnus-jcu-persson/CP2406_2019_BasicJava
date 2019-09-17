package week7;

public class BaseballGame {

    private String teamOneName;
    private String teamTwoName;
    protected Integer[][] teamScores = new Integer[2][9];

    public String getTeamOneName() {
        return teamOneName;
    }

    public void setTeamOneName(String teamOneName) {
        this.teamOneName = teamOneName;
    }

    public String getTeamTwoName() {
        return teamTwoName;
    }

    public void setTeamTwoName(String teamTwoName) {
        this.teamTwoName = teamTwoName;
    }

    public Integer getTeamInningScore(Integer team, Integer inning) {
        return teamScores[team][inning];
    }

    public void setTeamInningScore(Integer team, Integer inning, Integer score) throws Exception {
        for(Integer i = inning-1; i >= 0; i--) {
            if (this.teamScores[team][i] == null) {
                throw new Exception("Inning " + i + " not complete");
            }
        }

        this.teamScores[team][inning] = score;
    }

    public String determineWinner() {
        Integer[] teamFinalScores = new Integer[2];
        teamFinalScores[0] = 0;
        teamFinalScores[1] = 0;

        for(Integer team = 0; team < teamScores.length; team++) {
            for(Integer i = 0; i < teamScores[team].length; i++) {
                teamFinalScores[team] += teamScores[team][i];
            }
        }

        if (teamFinalScores[0].equals(teamFinalScores[1])) {
            return "Tie";
        } else if (teamFinalScores[0] > teamFinalScores[1]) {
            return teamOneName;
        } else {
            return teamTwoName;
        }
    }
}
