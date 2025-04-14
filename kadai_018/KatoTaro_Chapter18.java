package kadai_018;

public class KatoTaro_Chapter18 extends Kato_Chapter18{
	
	// コンストラクタでgivenNameとaddressを設定
    public KatoTaro_Chapter18() {
        this.givenName = "太郎";            // 名を花子に設定
        this.address = "東京都中野区〇×";  // 住所を東京都中野区〇×に設定
    }
	
	public void eachIntroduce() {
		System.out.println("Javaが得意です");
	}
	
}
