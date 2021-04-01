//Question:-Find maximum length sub-array having given sum
package Arrays;
import java.util.*;
public class Maximum_LengthsubarraywithGivenSum {

	public static void main(String[] args) {
		int[] a={ 5, 6, -5, 5, 3, 5, 3, -2, 0 };
		int sum=8;
		System.out.println("Max length subarray:- "+Findmaxsubarray(a,sum));

	}
	
	public static int Findmaxsubarray(int[] a,int s) {
		int sum=0,max=Integer.MIN_VALUE;
		for(int i=0;i<a.length;i++) {
			sum=0;
			for(int j=i;j<a.length;j++) {
				sum=sum+a[j];
				if(sum==s) {
					if(max < j-i)max=j-i;
				}
			}
		}
		return max+1;
	}
	
	
	

}
