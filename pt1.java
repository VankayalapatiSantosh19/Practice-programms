package pattern;

public class pt1 {
	 
	
		int i,j,k;
		void p1()
		{
			for(i=1;i<6;i++)
			{
				for(j=1;j<=i;j++)
				{
					System.out.print(i);
				}
				System.out.println("\n");
			}
		}
		void p2()
		{
			for(i=1;i<=6;i++)
			{
				for(j=1;j<i;j++)
				{
					System.out.print(j);
				}
				System.out.println("\n");
			}
		}
		void p3()
		{
			for(i=4;i>=0;i--)
			{
				for(j=0;j<=i;j++)
				{
					System.out.print("*");
				}
			    System.out.println("\n");
			}
		}
		public static void main(String[] args)
		{
			pt1 ob=new pt1();
			ob.p3();
			
		}
	}



