import java.util.*;
import java.io.*;
public class bitmasking {
    public static void main(String[] args) throws Exception {
        BufferedReader b=new BufferedReader(new InputStreamReader(System.in));
        int n=Integer.parseInt(b.readLine());
        int position=Integer.parseInt(b.readLine());
        n=Integer.parseInt(Integer.toBinaryString(n));
        int mask=0b000001;
        mask=mask<<position;
        if((n & mask) != 0)
            System.out.println(true);
        else
            System.out.println(false);
        
    }
}
