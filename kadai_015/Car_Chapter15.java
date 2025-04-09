package kadai_015;

//車クラス
public class Car_Chapter15 {

	//フィールド
	private static int  gear = 1;  // 	ギア
	private static int speed = 10;  // スピード
	private static int runspeed = 0;  // ギアチェンジ後の走行スピード
	
	
	//メソッド　ギアに応じてギアに応じて変速させる
	public void gearChange(int afterGear) {
		runspeed = afterGear * speed;
		System.out.println("ギア"+gear+"から"+afterGear+"に切り替わりました");
		run();
	}
	//メソッド　ギアチェンジ後の速度を表示させる
	public void run() {
		System.out.println("速度は"+runspeed+"Kmです");
	}

}
