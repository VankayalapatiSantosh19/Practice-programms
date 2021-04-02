package Arrays;

import java.util.*;

public class subarraysum_K {
	public static void main(String[] args) {
		int[] nums = { 3,4,7,2,-3,1,4,2 };
		int k = 7;
		System.out.println(subarraySum1(nums, k));

	}

	public static void subarraySum(int[] a, int k) { // naive solution
		for (int i = 0; i < a.length; i++) {
			int sum = 0;
			for (int j = i; j < a.length; j++) {
				sum += a[j];
				if (sum == k) {
					System.out.println("Sub Array sum is " + k + " from: " + i + " to " + j);
				}
			}
		}

	}

	public static int subarraySum1(int[] a, int k) { 
		int count=0,sum=0;
		HashMap<Integer,Integer> h=new HashMap<Integer,Integer>();
		for(int i=0;i<a.length;i++) {
			sum=sum+a[i];
			if(sum==k || h.containsKey(sum-k))count++;
			h.put(sum, i);
		}
        return count;
	}

}
