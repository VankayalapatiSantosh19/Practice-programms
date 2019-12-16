import java.util.*;
public class recursive_binary
{
    int binary(int n)
    {
        if(n==0)
           return 0;
        binary(n/2);
        System.out.printf("%d",n%2);
        return 0;
    } 
    public static void main(String[] args)
     {
          recursive_binary ob=new recursive_binary();
          ob.binary(15);
     }
}