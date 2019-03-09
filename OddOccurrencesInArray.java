package rakuten_work;


public class OddOccurrencesInArray {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

		int[] test1 = {1,2,3,4,3,4,1};

		System.out.println(solution(test1));
	}

	public static int solution(int[] A) {
		// write your code in Java SE 8
		int work = 0;

		for (int i = 0; i < A.length; i++) {
			work = work ^ A[i];
		}
		return work;
	}

}
