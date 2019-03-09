package rakuten_work;

public class ShellSort {
	/*
	シェルソート (Shell Sort)

	平均計算量： O(n1.25)

	挿入ソートでは隣り合う要素で比較、交換が行われます、シェルソートは h ずつ離れた要素を比較/交換します。
	h 離れた要素を整列する処理を h-ソート と言います。h-ソートの整列ロジックには挿入ソートが用いられます。
	シェルソートでは h-ソートの h の数を小さくしてゆくことで最終的に単純な挿入ソート(h=1)になります。挿入ソートになった頃には「ほぼ整列している」状態ができあがっているので挿入ソートのメリットを活かした整列が行えるのです。
	*/
	public static void sort(int[] array) {
		int h = array.length / 2;

		while (h > 0) {
			for (int i = h; i < array.length; i++) {
				int j = i;
				while (j >= h && array[j - h] > array[j]) {
					int tmp = array[j];
					array[j] = array[j - h];
					array[j - h] = tmp;
					j--;
				}
			}
			h /= 2;
		}

	}

	public static void main(String[] args) {
		int[] test = { 10, 75, 24, 32, 98,
				72, 88, 43, 60, 35,
				54, 62, 2, 12, 82,
		};
		ShellSort.sort(test);
		for (int i = 0; i < test.length; i++) {
			System.out.println((i + 1) + ":" + test[i]);
		}

	}
}
