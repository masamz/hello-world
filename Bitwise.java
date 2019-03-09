package rakuten_work;

public class Bitwise {
	public static int xor(int from, int to) {
		if (from >= to) {
			return 0;
		}
		int r = from;
		for (int i = from + 1; i <= to; i++) {
			r = r ^ i;
		}
		return r;
	}

	public static void main(String[] arg) {
		int[] nums = { 127, 128 };
		System.out.println(xor(nums[0], nums[1]));
	}

}
