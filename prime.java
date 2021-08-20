
public class prime {

	public static void main(String[] args) {
		System.out.println("This Program is Written by");
		System.out.println("Shravan V, 4NI19IS090, B Section");
		System.out.println();
		int num=50;
		for(int i=2;i<=num;i++)
		{
			int flag=0;
			for(int j=2;j<i;j++)
			{
				if(i%j==0)
				{
					flag=1;
				}	
			}
			if(flag==0)
			{
				System.out.print(i+" ");
			}
		}
	}

}
