package searching_and_sorting;
public class BinarySearch {
    public static int binarysearch(int[] a,int k,int f,int l)
    {
        if(k>a[l] || k<a[0])
            return -1;
        int m=f+(int)Math.floor((l-f)/2);
        if(a[m]==k)    // here m=f=l but a[m]=k
            return m;
        if(f-l==0)     //here m=f=l but a[m]!=k
            return -1;
        if(a[m]<k)
           return binarysearch(a,k,m+1,l);
        else
           return binarysearch(a,k,f,m-1);
    }
    public static void main(String[] args) {
        int a[]={2,2,5,8,8,12,16,23,38,56,72,91,91},k=8;
        System.out.println("The position of the element in array is = " + binarysearch(a,k,0,a.length-1));
    }
}

       
       
