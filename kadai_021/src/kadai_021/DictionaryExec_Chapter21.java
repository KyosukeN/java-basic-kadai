package kadai_021;

public class DictionaryExec_Chapter21 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

		// 辞書クラスのインスタンスを作成する
		Dictionary_Chapter21 dictionary = new Dictionary_Chapter21();

		// 辞書を調べる英単語を配列にセットする
		String[] array1 = { "apple", "banana", "grape", "orange" };

		for (String word : array1) {

			// 辞書を調べるメソッドを呼び出す
			dictionary.serchDictionary(word);
		}
	}

}
