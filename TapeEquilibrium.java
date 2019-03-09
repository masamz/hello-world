package rakuten_work;

//you can also use imports, for example:
//import java.util.*;

//you can write to stdout for debugging purposes, e.g.
//System.out.println("this is a debug message");

class TapeEquilibrium {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

		int[] test1 = { 1, 2, 3, 4, 3, 4, 1 };
		int[] test2 = new int[1000000];

		for (int i = 0; i < test2.length; i++) {
			test2[i] = (int) (Math.random() * 2000) - 1000;
		}

		int result = 0;
		//		int[] result;

		long lStartTime = System.currentTimeMillis();
		long lEndTime = System.currentTimeMillis();

		lStartTime = System.currentTimeMillis();
		result = solution(test2);
		lEndTime = System.currentTimeMillis();

		System.out.println("time=" + (lEndTime - lStartTime) + "msec");
		System.out.println("result=" + result);
	}

	public static int solution(int[] A) {
		// write your code in Java SE 8
		System.out.println("A=" + A[1]);

		int leftTotal = 0;
		int rightTotal = 0;
		for (int i = 0; i < A.length; i++) {
			rightTotal += A[i];
		}
		int tempAbs = Integer.MAX_VALUE;

		for (int i = 0; i < A.length - 1; i++) {
			leftTotal += A[i];
			rightTotal -= A[i];
			if (leftTotal == rightTotal) {
				return 0;
			}
			if (Math.abs(leftTotal - rightTotal) < tempAbs) {
				tempAbs = Math.abs(leftTotal - rightTotal);
			}
		}
		return tempAbs;
	}
}
