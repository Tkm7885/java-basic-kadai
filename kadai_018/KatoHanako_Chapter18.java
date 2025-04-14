package kadai_018;

public class KatoHanako_Chapter18 extends Kato_Chapter18 {
	
	// コンストラクタでgivenNameとaddressを設定
    public KatoHanako_Chapter18() {
        this.givenName = "花子";            // 名を花子に設定
        this.address = "東京都中野区〇×";  // 住所を東京都中野区〇×に設定
    }
	
	public void eachIntroduce() {
		System.out.println("趣味は読書です");
	}

}
