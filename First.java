import java.util.Scanner;
class First{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter size of element=");
		int temp,i;
		int size=sc.nextInt();
		int a[] =new int[size];
		for( i=0;i<a.length;i++)
		{
			a[i]=sc.nextInt();
			
		}
		
		for( i=0;i<a.length;i++)
		{
			 temp=a[i];
			a[i]=a[(size-1)-i];
			a[(size-1)-i]=temp;

		}
		System.out.println("reverse array...");
		for(i=0;i<a.length;i++)
		{
			System.out.println(a[i]);
		}
	}
}