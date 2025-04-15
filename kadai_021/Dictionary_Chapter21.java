package kadai_021;

import java.util.HashMap;

public class Dictionary_Chapter21 {

    // HashMapをインスタンスフィールドとして定義
    private HashMap<String, String> humanMap;

    // コンストラクタで初期化
    public Dictionary_Chapter21() {
        humanMap = new HashMap<String, String>();
        humanMap.put("apple", "りんご");
        humanMap.put("peach", "桃");
        humanMap.put("banana", "バナナ");
        humanMap.put("lemon", "レモン");
        humanMap.put("pear", "梨");
        humanMap.put("kiwi", "キウィ");
        humanMap.put("strawberry", "いちご");
        humanMap.put("grape", "ぶどう");
        humanMap.put("muscat", "マスカット");
        humanMap.put("cherry", "さくらんぼ");
    }

    // 辞書を返すメソッド
    public HashMap<String, String> getHumanMap() {
        return humanMap;
    }
    
    // 単語を検索し、意味を返すメソッド
    public void searchWord(String word) {
        if (humanMap.containsKey(word)) {
        	System.out.println(word+"の意味は"+humanMap.get(word));
            
        } else {
        	System.out.println(word+"は辞書に存在しません");
        }
    }
}
