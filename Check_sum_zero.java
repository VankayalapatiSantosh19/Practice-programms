//question-Check if subarray with 0 sum is exists or not
package Arrays;

import java.util.*;

public class Check_sum_zero {

	public static void solution1(int[] a) {
		boolean f=false;
		for (int i = 0; i < a.length; i++) {
			int sum=0;
			for (int j = i; j < a.length; j++) {
				sum += a[j];
				if (sum == 0) {
					for (int k = i; k <= j; k++) {//this loop is just for printing. actually no need
						System.out.print(a[k] + " ");
					}
					f=true;
					System.out.println();
				}
			}
		}
		if(!f)System.out.println("No Sub Arrays with sum ZERO");
		System.out.println("-----------------------------------");
	}

	public static boolean solution2(int[] a) {  //check if the sub-array sum 0 exists or not
		HashSet<Integer> h = new HashSet<Integer>();
		int sum = 0;
		for (int i = 0; i < a.length; i++) {
			sum = sum + a[i];
			if (h.contains(sum) || sum==0) {
				return true;
			}
			h.add(sum);
		}
		return false;
	}
	
	public static void solution3(int[] a) {   //print the sub array whose sum is 0
		HashMap<Integer,Integer> h = new HashMap<Integer,Integer>();
		int sum = 0;
		boolean f=false;
		for (int i = 0; i < a.length; i++) {
			sum=sum+a[i];
			if(sum==0 || h.containsKey(sum)) {
				if(sum==0)System.out.println("Sum is 0 from: 0 to "+ i);
				if(h.containsKey(sum))System.out.println("Sum is 0 from: "+(h.get(sum)+1) + " to " + i);
				f=true;
			}
			h.put(sum,i);
		}
		if(!f)System.out.println("No Sub Arrays with sum ZERO");
		System.out.println("-----------------------------------");
	}


	public static void main(String[] args) {
		int[] a = { 3, 4, -7, 3, 1, 3, 1, -4, -2, -2 };
		int[] b= {4, 2, -3, 1, 6};
		int[] c= {4, 2, 0, 1, 6};
		int[] d={-3, 2, 3, 1, 6};
		int[] e= {-5, 0, 2, 3, -3, 4, -1};
		int[] f= {1,-1,0};
		solution3(a);
		solution3(b);
		solution3(c);
		solution3(d);
		solution3(e);
		solution3(f);
	}
}
