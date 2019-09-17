package week7;

public class DemoLLBaseballGame {
    public static void main(String[] args) throws Exception {
        LittleLeagueBaseballGame llBaseballGame = new LittleLeagueBaseballGame();

        llBaseballGame.setTeamOneName("Tiddlywinks");
        llBaseballGame.setTeamTwoName("PutinKittens");

        try {
            llBaseballGame.setTeamInningScore(0, 5, 10);
        } catch (Exception e) {
            System.out.println("Error: " + e);
        }

        for(Integer i = 0; i <= 5; i++) {
            llBaseballGame.setTeamInningScore(0, i, 5);
            llBaseballGame.setTeamInningScore(1, i, 2);
        }

        System.out.println("Winner is " + llBaseballGame.determineWinner());
    }
}
