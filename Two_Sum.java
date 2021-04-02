//question-Find pair with given sum in an array
package Arrays;
import java.util.*;
public class Two_Sum {

	public static void main(String[] args) {
		int[] A = { 8, 7, 2, 5, 3, 1 };
		int sum = 10;

		findPair(A, sum);

	}
    //time:-O(n)
	public static void findPair(int[] a, int sum) {
		HashMap<Integer,Integer> h=new HashMap<Integer,Integer>();
		for(int i=0;i<a.length;i++) {
			if(h.containsKey(sum-a[i])) {
				System.out.println("Pair Found");
				System.out.println(a[i] +"," + (sum-a[i]));
				return;
			}
			h.put(a[i], i);
		}
	}

}
