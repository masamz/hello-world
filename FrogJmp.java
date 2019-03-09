package rakuten_work;

//you can also use imports, for example:
//import java.util.*;

//you can write to stdout for debugging purposes, e.g.
//System.out.println("this is a debug message");

class FrogJmp {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

		int[] test1 = { 10, 280, 63 };

		int result = 0;
		//		int[] result;

		result = solution(test1[0], test1[1], test1[2]);

		System.out.println("result=" + result);
	}

	public static int solution(int X, int Y, int D) {
		// write your code in Java SE 8

		if (X == Y) {
			return 0;
		}
		int leftD = Y - X;

		if (leftD % D == 0) {
			return (int) leftD / D;
		}

		return (int) leftD / D + 1;
	}
}
