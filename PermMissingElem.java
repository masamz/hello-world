package rakuten_work;

import java.util.Arrays;

//you can also use imports, for example:
//import java.util.*;

//you can write to stdout for debugging purposes, e.g.
//System.out.println("this is a debug message");

class PermMissingElem {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

		int[] test1 = { 2 };

		int result = 0;
		//		int[] result;

		result = solution(test1);

		System.out.println("result=" + result);
	}

	public static int solution(int[] A) {
		// write your code in Java SE 8

		// 別の課題（RakutenDEMO）を上書きしてしまった。

		if (A.length == 0) {
			return 1;
		}

		int[] B = new int[A.length];
		int count = 0;
		for (int i = 0; i < A.length; i++) {
			if (A[i] > 0) {
				B[count] = A[i];
				count++;
			}
		}

		if (count == 0) {
			return 1;
		}

		int[] C = new int[count];
		System.arraycopy(B, 0, C, 0, count);

		Arrays.sort(C);
		if (C[0] > 1) {
			return 1;
		}
		int result = 0;
		for (int i = 0; i < C.length - 1; i++) {
			result = C[i + 1];
			if (C[i + 1] - C[i] > 1) {
				return C[i] + 1;
			}
		}

		return result + 1;
	}
}
