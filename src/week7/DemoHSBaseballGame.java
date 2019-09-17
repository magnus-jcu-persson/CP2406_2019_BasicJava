package week7;

public class DemoHSBaseballGame {
    public static void main(String[] args) throws Exception {
        HighSchoolBaseballGame hsBaseballGame = new HighSchoolBaseballGame();

        hsBaseballGame.setTeamOneName("Tigers");
        hsBaseballGame.setTeamTwoName("Bears");

        try {
            hsBaseballGame.setTeamInningScore(0, 5, 10);
        } catch (Exception e) {
            System.out.println("Error: " + e);
        }

        for(Integer i = 0; i <= 6; i++) {
            hsBaseballGame.setTeamInningScore(0, i, 5);
            hsBaseballGame.setTeamInningScore(1, i, 8);
        }

        System.out.println("Winner is " + hsBaseballGame.determineWinner());
    }
}
