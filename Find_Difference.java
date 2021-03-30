//https://leetcode.com/problems/find-the-difference/description/
//Find the difference
package StringAlgorithms;
import java.util.*;
public class Find_Difference {
    public char findTheDifference(String s, String t){
        //my solution
       HashMap<Character,Integer> h=new HashMap<Character,Integer>();
       for(int i=0;i<s.length();i++){
           if(h.containsKey(s.charAt(i)))
               h.put(s.charAt(i),h.get(s.charAt(i))+1);
           else
               h.put(s.charAt(i),1);
       }
       for(int i=0;i<t.length();i++){
           if(h.containsKey(t.charAt(i)))
              h.put(t.charAt(i),h.get(t.charAt(i))-1);
           else 
              return t.charAt(i);
       }
       Set s1=h.keySet();
       for(Object i:s1){
           if(h.get(i)!=0)
               return (Character)i;
       }
       return '#';
    }
    public static void main(String[] args) {
        /*
        actual solution.
        int sum1=0;
        int sum2=0;
        for(int i=0;i<s.length();i++){
            sum1+=s.charAt(i);
        }
        for(int i=0;i<t.length();i++){
            sum2+=t.charAt(i);
        }
        int a=sum2-sum1;
        char c=(char)(a);
        return c;
        */
        
        
    }
}
