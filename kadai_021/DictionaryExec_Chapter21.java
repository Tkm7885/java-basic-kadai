package kadai_021;

public class DictionaryExec_Chapter21 {

    public static void main(String[] args) {
        // Dictionary_Chapter21のインスタンスを作成
        Dictionary_Chapter21 dictionary = new Dictionary_Chapter21();
        // 辞書の内容を検索して表示
        dictionary.searchWord("apple");
        dictionary.searchWord("banana");
        dictionary.searchWord("grape");
        dictionary.searchWord("orange");  // "意味は登録されていません"が表示されます
    }
}
