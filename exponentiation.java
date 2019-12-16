import java.util.*;
public class exponentiation
{
   int binaryExpo(int x,int n)
   {    
       if(n==0)
       {
           return 1;  
       }
       else if(n%2==0)
       {
           return binaryExpo(x*x,n/2);   
            
       }
       else
       {
           return x*binaryExpo(x*x,(n-1)/2);
       }
   }
   public static void main(String[] args)
   {
       int x,n;
       Scanner i = new Scanner(System.in);
       x=i.nextInt();
       n=i.nextInt();
       exponentiation s=new exponentiation();
       System.out.println(s.binaryExpo(x,n));
   }
}