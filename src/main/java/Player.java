package jp.ac.uryukyu.ie.e245739;

/**
 * プレイヤーを表すクラス
 */
public class Player {
    private int choice; // プレイヤーの選択

    // プレイヤーの選択を設定
    public void setChoice(int choice) {
        if (choice >= 0 && choice <= 2) {
            this.choice = choice;
        } else {
            System.out.println("無効な選択です。0（グー）、1（パー）、2（チョキ）のいずれかを選んでください。");
        }
    }

    // プレイヤーの選択を取得
    public int getChoice() {
        return this.choice;
    }
}
