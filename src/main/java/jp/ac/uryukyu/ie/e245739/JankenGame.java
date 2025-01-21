package jp.ac.uryukyu.ie.e245739;

import java.util.Random;

/**
 * じゃんけんゲームのロジックを管理するクラス
 */
public class JankenGame {

    public static final int ROCK = 0;
    public static final int PAPER = 1;
    public static final int SCISSORS = 2;

    /**
     * コンピュータの手をランダムに決定するメソッド
     * @return 0, 1, 2 のいずれか
     */
    public int getComputerChoice() {
        Random rand = new Random();
        return rand.nextInt(3); // グー、パー、チョキのいずれかを返す
    }

    /**
     * 勝敗を決定するメソッド
     * @param playerChoice プレイヤーの選択 (0: グー, 1: パー, 2: チョキ)
     * @param computerChoice コンピュータの選択 (0: グー, 1: パー, 2: チョキ)
     * @return 勝敗結果 (例: "Player Wins", "Computer Wins", "Draw")
     */
    public String determineWinner(int playerChoice, int computerChoice) {
        if (playerChoice == computerChoice) {
            return "Draw";
        } else if ((playerChoice == ROCK && computerChoice == SCISSORS) ||
                (playerChoice == PAPER && computerChoice == ROCK) ||
                (playerChoice == SCISSORS && computerChoice == PAPER)) {
            return "Player Wins";
        } else {
            return "Computer Wins";
        }
    }

    /**
     * コンピュータの選択を文字列に変換するメソッド
     * @param choice コンピュータの選択 (0: グー, 1: パー, 2: チョキ)
     * @return 文字列形式での選択 ("グー", "パー", "チョキ")
     */
    public String getChoiceString(int choice) {
        switch (choice) {
            case ROCK: return "グー";
            case PAPER: return "パー";
            case SCISSORS: return "チョキ";
            default: return "不明";
        }
    }
}
