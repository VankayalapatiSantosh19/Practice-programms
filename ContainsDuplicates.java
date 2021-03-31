package Arrays;
import java.util.*;
public class ContainsDuplicates {
    public static boolean containsduplicates(int[] a){
        HashSet<Integer> h=new HashSet<Integer>();
        for(int i=0;i<a.length;i++)
            if(!(h.add(a[i])))
                return true;
        return false;
        
    }
    public static void main(String[] args) {
       int[] a={1,2,3,4};
       System.out.println(containsduplicates(a));
       
       
    }
}
