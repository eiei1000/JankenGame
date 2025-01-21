package jp.ac.uryukyu.ie.e245739;

import java.util.Scanner;

/**
 * ゲームを実行するメインクラス
 */
public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        JankenGame game = new JankenGame();
        
        // ゲームの開始
        System.out.println("じゃんけんゲームへようこそ！");
        System.out.println("選択肢: 0 - グー, 1 - パー, 2 - チョキ");

        // プレイヤーの入力を受け取る
        System.out.print("あなたの選択を入力してください: ");
        int playerChoice = scanner.nextInt();

        // コンピュータの選択
        int computerChoice = game.getComputerChoice();
        System.out.println("コンピュータの選択: " + game.getComputerChoiceString(computerChoice));

        // 勝敗を判定
        String result = game.determineWinner(playerChoice, computerChoice);
        System.out.println("結果: " + result);
    }
}
