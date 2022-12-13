package ss9_CleanCode_Refactoring.bai_tap.Refactoring;

public class TennisGame {

    public static final String SCORE = "-";

    public static String getScore(String playName1, String playName2, int score1, int score2) {
        String score = "";
        int tempScore = 0;
        if (score1 == score2) {
            switch (score1) {
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
        } else {
            for (int i = 1; i < 3; i++) {
                if (i == 1) {
                    tempScore = score1;
                } else {
                    score += SCORE;
                    tempScore = score2;
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
        }
        return score;
    }
}
