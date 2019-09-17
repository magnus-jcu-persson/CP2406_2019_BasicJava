package week7;

public class DemoBaseballGame {
    public static void main(String[] args) throws Exception {
        BaseballGame baseballGame = new BaseballGame();

        baseballGame.setTeamOneName("Menthol");
        baseballGame.setTeamTwoName("Vanilla");

        try {
            baseballGame.setTeamInningScore(0, 5, 10);
        } catch (Exception e) {
            System.out.println("Error: " + e);
        }

        for(Integer i = 0; i <= 8; i++) {
            baseballGame.setTeamInningScore(0, i, 9);
            baseballGame.setTeamInningScore(1, i, 8);
        }

        System.out.println("Winner is " + baseballGame.determineWinner());
    }

}
