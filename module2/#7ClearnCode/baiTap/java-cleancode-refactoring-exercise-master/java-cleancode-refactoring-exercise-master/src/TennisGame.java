public class TennisGame {

    public static final int play1LastVictory = 1;
    public static final int play2LastVictory = -1;
    public static final int play1Win = 2;

    public static String getScore(String player1Name, String player2Name, int scorePlay1, int scorePlay2) {
        String score = "";
        int tempScore = 0;
        if (scorePlay1 == scorePlay2) {
            switch (scorePlay1) {
                case 0:
                    score = "Love-All";
                    break;
                case 1:
                    score = "Fifteen-All";
                    break;
                case 2:
                    score = "Thirty-All";
                    break;
                case 3:
                    score = "Forty-All";
                    break;
                default:
                    score = "Deuce";
                    break;

            }
        } else if (scorePlay1 >= 4 || scorePlay2 >= 4) {
            int minusResult = scorePlay1 - scorePlay2;
            if (minusResult == play1LastVictory) {
                score = "Advantage player1";
            } else if (minusResult == play2LastVictory) {
                score = "Advantage player2";
            } else if (minusResult >= play1Win) {
                score = "Win for player1";
            } else {
                score = "Win for player2";
            }

        } else {
            score = getString(scorePlay1, scorePlay2, score);
        }
        return score;
    }

    private static String getString(int scorePlay1, int scorePlay2, String score) {
        int tempScore;
        for (int i = 1; i < 3; i++) {
            if (i == 1) {
                tempScore = scorePlay1;
            }
            else {
                score += "-";
                tempScore = scorePlay2;
            }
            switch (tempScore) {
                case 0:
                    score += "Love";
                    break;
                case 1:
                    score += "Fifteen";
                    break;
                case 2:
                    score += "Thirty";
                    break;
                case 3:
                    score += "Forty";
                    break;
            }
        }
        return score;
    }
}
