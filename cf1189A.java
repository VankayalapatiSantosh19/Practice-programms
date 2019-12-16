import java.util.*;
public class cf1189A
{
   public static void main(String[] args)
   {
       int l,count=0;
       String s;
       Scanner sc=new Scanner(System.in);
       l=sc.nextInt();
       sc.nextLine();
       s=sc.nextLine();  
       for(int i=0;i<l;i++)
       {
           if (s.charAt(i)=='0')
           {
               count=count+1;
           }
           else
               count=count-1; 
       }
   
       if(count!=0)
           System.out.print(s);
       else
           System.out.print(s.substring(0,l-1) + " " + s.substring(l-1));
     }
}