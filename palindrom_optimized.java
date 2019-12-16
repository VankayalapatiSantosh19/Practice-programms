import java.util.*;
class palindrom_optimized{
   public static void main(String[] args){
         Scanner ip=new Scanner(System.in);
         String s=ip.nextLine();
         int n=s.length();
         Boolean f=true; 
         for(int i=0;i<n/2 && f;i++)
         {
             if(s.charAt(i)!=s.charAt(n-1-i))
                   f=false;
         }
         if(f)
           System.out.println("yes");
         else
           System.out.println("no");   
    } 
}