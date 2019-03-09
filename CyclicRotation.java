package rakuten_work;

public class CyclicRotation {
	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

		int[] test1 = { 3, 8, 9, 7, 6 };
		int k = 3;
		System.out.println(solution(test1, k));
	}

	public static int[] solution(int[] A, int K) {
		// write your code in Java SE 8
		if (A.length == 0 || K == 0) {
			return A;
		}

		int shiftCount = K % A.length;
		System.out.println("shiftCount=" + shiftCount);

		int[] resultArray = new int[A.length];

		System.arraycopy(A, 0, resultArray, shiftCount, resultArray.length - shiftCount);
		System.arraycopy(A, resultArray.length - shiftCount, resultArray, 0, shiftCount);

		return resultArray;
	}
}
