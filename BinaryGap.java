package rakuten_work;

public class BinaryGap {
	public static int solution(int N) {
		System.out.println("N=" + N);

		if (N <= 0) {
			return 0;
		}
		int count = 0;
		int maxCount = 0;
		boolean valid = false;
		int maxDigit = 0;
		int startDigit = 0;

		maxDigit = (int) (Math.log(N) / Math.log(2)) + 1;
		System.out.println("maxDigit=" + maxDigit);
		for (int i = 1; i < maxDigit + 1; i++) {
			if (N % 2 == 1) {
				startDigit = i;
				break;
			}
			N = N / 2;
		}

		for (int i = startDigit; i < maxDigit + 1; i++) {
			valid = false;
			if (N % 2 == 0) {
				valid = true;
			}
			N = N / 2;
			if (valid) {
				count++;
				if (count > maxCount) {
					maxCount = count;
				}
			} else {
				count = 0;
			}
		}

		return maxCount;
	}

	public static void main(String[] arg) {
		int N = 2;
		for (int i = 127; i < 140; i++) {
			int r = solution(i);
			System.out.println("solution=" + r);
		}

		//		System.out.print(solution(N));
	}

}
