//question-Sort a binary array in linear time
package Arrays;
import java.util.*;
public class sort_binary_array {
	public static void main(String[] args) {
		int[] a= { 0, 0, 1, 0, 1, 1, 0, 1, 0, 0 };
		sort3(a);
		System.out.println(Arrays.toString(a));
	}
	public static void sort1(int[] a) {
		Arrays.sort(a);
	}
	public static void sort2(int[] a) {
		int z=0,o=0;
		for(int i=0;i<a.length;i++) {
			if(a[i]==0)z++;
			else o++;
		}
		int i=0;
		while(z-- >0) {
			a[i]=0;
			i++;
		}
		while(o-- >0) {
			a[i]=1;
			i++;
		}
	}
	public static void sort3(int[] a) { 
		int j=0;
		for(int i=0;i<a.length;i++) {
			if(a[i]==0) {
				a[j++]=0;
			}
		}
		for(int i=j;i<a.length;i++)a[i]=1;
	}
	public static void sort4(int[] a) { // using quick sort partitioning.
		
	}
	

}
