package kadai_018;

public class KatoExec_Chapter18 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		
		Kato_Chapter18 hanako = new KatoHanako_Chapter18();
		hanako.setGivenName("花子");
		
		Kato_Chapter18 ichiro = new KatoIchiro_Chapter18();
		ichiro.setGivenName("一郎");
		
		Kato_Chapter18 taro = new KatoTaro_Chapter18();
		taro.setGivenName("太郎");
		
		hanako.execIntroduce();
		System.out.println("------------");
		ichiro.execIntroduce();
		System.out.println("------------");
		taro.execIntroduce();
		
	}

}
