package kadai_021;

public class DictionaryExec_Chapter21 {

    public static void main(String[] args) {
        // Dictionary_Chapter21のインスタンスを作成
        Dictionary_Chapter21 dictionary = new Dictionary_Chapter21();

        // 単語の意味を検索し、結果を表示
        System.out.println("appleの意味は " + dictionary.searchWord("apple"));
        System.out.println("bananaの意味は " + dictionary.searchWord("banana"));
        System.out.println("grapeの意味は " + dictionary.searchWord("grape"));
        System.out.println("orangeの意味は " + dictionary.searchWord("orange"));  // 未登録の単語
    }

}
