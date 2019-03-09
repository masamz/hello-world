package rakuten_work;

//you can also use imports, for example:
//import java.util.*;

//you can write to stdout for debugging purposes, e.g.
//System.out.println("this is a debug message");

class PermCheck {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

		int[] test1 = { 3, 2, 4};

		int result = 0;
		//		int[] result;

		long lStartTime = System.currentTimeMillis();
		long lEndTime = System.currentTimeMillis();

		lStartTime = System.currentTimeMillis();
		result = solution(test1);
		lEndTime = System.currentTimeMillis();

		System.out.println("time=" + (lEndTime - lStartTime) + "msec");
		System.out.println("result=" + result);
	}

	public static int solution(int[] A) {
		// write your code in Java SE 8

		// 未完成

		if (A.length == 0) {
			return 0;
		}

		int arraySum = 0;
		int numSum = 0;
		int xor = 0;
		for (int i = 0; i < A.length; i++) {
			arraySum += A[i];
			numSum += (i+1);
			xor ^= arraySum;
			xor ^= numSum;
		}
		if (arraySum != numSum || xor != 0) {
			return 0;
		}

		int result = A.length + 1;
		for (int i = 0; i < A.length; i++) {
			result += (i + 1);
			result -= A[i];
		}

		int rCode = 0;
		if(result == A.length + 1) {
			rCode = 1;
		}
		return rCode;
	}
}
