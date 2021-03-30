package StringAlgorithms;
import java.util.*;
public class frequencyofletters {
    public static void main(String[] args) throws Exception{
        String s="santosh";
        int max=0;
        char ch='0';
        Map<Character,Integer> h=new HashMap<Character ,Integer>();
       /*  for(char i:s.toCharArray())
            h.put(i,0);*/
        for(int i=0;i<s.length();i++){
            if(h.containsKey(s.charAt(i)))
                h.put(s.charAt(i),(h.get(s.charAt(i))+1));
            else
                h.put(s.charAt(i),1);
        }
        System.out.println(h);
        for(int i=0;i<s.length();i++){
            if(h.get(s.charAt(i)) > max){
                max=h.get(s.charAt(i));
                ch=s.charAt(i);
            }
        }
        System.out.println("the maximum Charecter Repeated is  "+ ch + "=" + max);
        
        
    }
    
}
