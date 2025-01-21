package jp.ac.uryukyu.ie.e245739;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // プレイヤーとゲームのインスタンスを作成
        Player player = new Player();
        JankenGame game = new JankenGame();
        Scanner scanner = new Scanner(System.in);

        // ゲームの説明
        System.out.println("じゃんけんゲームを始めます！");
        System.out.println("0: グー, 1: パー, 2: チョキ");

        // プレイヤーの選択を入力
        System.out.print("あなたの選択を入力してください（0, 1, 2）: ");
        int playerChoice = scanner.nextInt();
        player.setChoice(playerChoice);  // プレイヤーの選択をセット

        // コンピュータの選択をランダムで決定
        int computerChoice = game.getComputerChoice();

        // 勝敗を判定
        String result = game.determineWinner(player.getChoice(), computerChoice);

        // 結果の表示
        System.out.println("あなたの選択: " + game.getChoiceString(player.getChoice()));
        System.out.println("コンピュータの選択: " + game.getChoiceString(computerChoice));
        System.out.println("結果: " + result);
        
        // スキャナーを閉じる
        scanner.close();
    }
}
