//Finding the first unique charecter.
package StringAlgorithms;
import java.util.*;
public class firstNonrepeatingcharecter {
    public static void main(String[] args) {
        String s="GeekVedio";
        HashMap<Character,Integer> m=new HashMap<Character,Integer>();
        for(int i=0;i<s.length();i++){
            if(m.containsKey(s.charAt(i)))
                m.put(s.charAt(i),m.get(s.charAt(i))+1);
            else
                m.put(s.charAt(i), 1);
        }
        for(int i=0;i<s.length();i++){
            if(m.get(s.charAt(i))==1){
                System.out.println(s.charAt(i));
                return;
            }
        }
        
       
    }
    
}
