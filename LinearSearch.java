package rakuten_work;

public class LinearSearch {
	/*
	リニアサーチ (Linear Search)

	平均計算量： O(n)

	1. リストの先頭から要素を取り出す
	2. 取り出した要素の値と探したい要素の値を比較する
	   ・一致すれば探索完了
	   ・一致しなければ 1. へ戻り次の要素を取り出す
	*/
	public static int execute(int[] data, int target) {
		int notFound = -1;
		for (int i = 0; i < data.length; i++) {
			if (data[i] == target) {
				return i;
			}
		}
		return notFound;
	}

	public static void main(String[] args) {
		int[] data = { 1, 2, 3, 4, 5 };
		int result;
		result = LinearSearch.execute(data, 3);
		if (result != -1) {
			System.out.println("Found: index key = " + result);
		} else {
			System.out.println("Not found.");
		}
	}
}
