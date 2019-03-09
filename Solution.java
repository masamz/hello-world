package rakuten_work;

//you can also use imports, for example:
//import java.util.*;

//you can write to stdout for debugging purposes, e.g.
//System.out.println("this is a debug message");

class Solution {

	public int solution(int[] A) {
		// write your code in Java SE 8

		int chk[] = new int[100000];

		for (int i = 0;i < A.length; i++) {
			if (A[i] <= 0) continue;
			if (chk[A[i]-1] == 0) {
				chk[A[i]-1] = 1;
			}
		}

		int r = 1;
		for (int i = 0;i < chk.length; i++) {
    			if (chk[i] == 0) break;
			r++;
		}

		return r;
	}
}
