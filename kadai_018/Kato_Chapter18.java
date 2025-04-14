package kadai_018;

//抽象クラス
abstract public class Kato_Chapter18 {
	
	public String familyName = "加藤"; //姓
	public String givenName;  //名
	public String address;    //住所
		
	//共通の紹介
	public void commonIntroduce(String familyName,String givenName,String address) {
		System.out.println("名前は"+familyName+givenName+"です");
		System.out.println("住所は"+address+"です");
	}
	//抽象メソッド 個別の紹介
	abstract public void eachIntroduce();
	
	////紹介の実行
	public void execIntroduce() {
		commonIntroduce(familyName,givenName,address);
		eachIntroduce();
		
	}
}
