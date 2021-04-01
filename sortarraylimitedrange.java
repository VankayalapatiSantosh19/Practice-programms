//question:-Find duplicate element in a limited range array with O(1) space.
package Arrays;

import java.util.*;
import java.util.stream.IntStream;

public class sortarraylimitedrange {

	public static void main(String[] args) {
		int[] A = { 1, 2, 3, 4, 4 };
		int x = solution4(A);
		if (x == -1)
			System.out.println("No duplicate");
		System.out.println("The duplicate element is " + x);

	}

	public static int solution1(int[] a) { // sort and find duplicate
		Arrays.sort(a);
		int i = 0, j = 1;
		for (; i < a.length - 1; i++, j++) {
			if (a[i] == a[j])
				return a[i];
		}
		return -1;
	}

	public static int solution2(int[] A) {// using difference in sum
		int actual_sum = IntStream.of(A).sum();
		int expected_sum = A.length * (A.length - 1) / 2;
		return actual_sum - expected_sum;
	}

	public static int solution3(int[] A) { //using Xor
		int xor = 0;
		// take xor of all array elements
		for (int value : A) {
			xor ^= value;
		}

		// take xor of numbers from 1 to `n-1`
		for (int i = 1; i <= A.length - 1; i++) {
			xor ^= i;
		}

		// same elements will cancel each other as a ^ a = 0,
		// 0 ^ 0 = 0 and a ^ 0 = a

		// `xor` will contain the missing number
		return xor;
	}
	
	public static int solution4(int[] a) { //negation trick.
		for(int i=0;i<a.length;i++) {
			if(a[Math.abs(a[i])]<=0)
				return Math.abs(a[i]);
			a[Math.abs(a[i])]*=-1;
		}
		return -1;
	}
		
	

}
