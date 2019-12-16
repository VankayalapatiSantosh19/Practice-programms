import java.util.*;
public class GCD
{
   int i=1,factor=1;
   int gcd_looping(int n,int m)
   {
       for(i=1;i<=n && i<=m;i++)
       {
            if(n%i==0 && m%i==0)
            {
                  factor=i;
             }
       }    
       System.out.printf("the gcd of %d and %d is %d", n ,m ,factor); 
       return 0;
   }   
   int gcd_recursive(int n,int m)
   {
        if(m==0)
           System.out.print();
        else
            return gcd_recursive(m,n%m);   
   }  
   public static void main(String[] args)
   {
       Scanner s=new Scanner(System.in);
       int n=s.nextInt();
       int m=s.nextInt();
       GCD ip=new GCD();
       ip.gcd_looping(n,m);
       ip.gcd_recursive(n,m);
       
         
   }
}