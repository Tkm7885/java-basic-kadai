package kadai_028;

import java.util.HashMap;
import java.util.Scanner;

public class Jyanken_Chapter28 {
	
	//自分のじゃんけんの手を入力する
	public String getMyChoice() {
		System.out.println("自分のじゃんけんの手を入力しましょう");
		System.out.println("グーはrockのrを入力しましょう\nチョキはscissorsのsを入力しましょう\nパーはpaperのpを入力しましょう");
		System.out.print(":");
		
		//Scannerクラスのオブジェクトを生成する
		Scanner scanner = new Scanner(System.in);
		String input = "";
      			
  		//正しい入力になるまでループ
  		while (true) {
  			//入力した内容を取得する
  			input = scanner.nextLine();
  			
  			//入力内容のチェックを行う
  			if (input.equals("r") || input.equals("s") || input.equals("p")) {
                break; // ループを終了
            } else {
                System.out.println("無効な入力です。再度入力してください。");
                //ループ続行
            }
  		}
  		scanner.close();
		return input;
	}
	
	//対戦相手のじゃんけんの手を乱数で選ぶ
	public String getRandom() {
		String[] scoreArray = { "r", "s", "p",};
	    // 0～2のいずれかをランダムに生成
	    int randNum = (int)(Math.random() * 2);
	    String bot = scoreArray[randNum];
		return bot;
	}
	
	//じゃんけんを行う
	public void playGame() {
		HashMap<String,String> hand = new HashMap<String,String>();

		hand.put("r","グー");
		hand.put("s","チョキ");
		hand.put("p","パー");
		String userhand =hand.get(getMyChoice());
		String bothand =hand.get(getRandom());
		//String userhand ="パー";
		//String bothand ="パー";
		
		//手を格納
		System.out.println("自分の手は"+userhand);
		System.out.println("相手の手は"+bothand);
		
		//勝負!!
		
			if((userhand.equals("パー") && bothand.equals("グー")) || 
			  (userhand.equals("チョキ") && bothand.equals("パー")) || 
			  (userhand.equals("グー") && bothand.equals("チョキ"))) {
				System.out.println("自分の勝ちです");
			}else if((userhand.equals("グー") && bothand.equals("パー")) || 
					(userhand.equals("パー") && bothand.equals("チョキ")) || 
					(userhand.equals("チョキ") && bothand.equals("グー"))){
				System.out.println("自分の負けです");
			}else {
				System.out.println("あいこです");
			}
	}

}
