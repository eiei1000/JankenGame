package jp.ac.uryukyu.ie.e245739;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

/**
 * JankenGame クラスのユニットテスト
 */
public class JankenGameTest {

    /**
     * 勝敗判定テスト
     */
    @Test
    public void testDetermineWinner() {
        JankenGame game = new JankenGame();

        // プレイヤーがグー、コンピュータがチョキの場合
        assertEquals("Player Wins", game.determineWinner(JankenGame.ROCK, JankenGame.SCISSORS));

        // プレイヤーがパー、コンピュータがグーの場合
        assertEquals("Player Wins", game.determineWinner(JankenGame.PAPER, JankenGame.ROCK));

        // プレイヤーがチョキ、コンピュータがパーの場合
        assertEquals("Player Wins", game.determineWinner(JankenGame.SCISSORS, JankenGame.PAPER));

        // プレイヤーとコンピュータが同じ場合（引き分け）
        assertEquals("Draw", game.determineWinner(JankenGame.ROCK, JankenGame.ROCK));
        assertEquals("Draw", game.determineWinner(JankenGame.PAPER, JankenGame.PAPER));
        assertEquals("Draw", game.determineWinner(JankenGame.SCISSORS, JankenGame.SCISSORS));
    }

    /**
     * コンピュータの選択を文字列に変換するメソッドのテスト
     */
    @Test
    public void testGetChoiceString() {
        JankenGame game = new JankenGame();

        assertEquals("グー", game.getChoiceString(JankenGame.ROCK));
        assertEquals("パー", game.getChoiceString(JankenGame.PAPER));
        assertEquals("チョキ", game.getChoiceString(JankenGame.SCISSORS));
    }
}
