import java.io.*;
import java.util.*;
class array1
{
	public static void main(String ar[])
	{
		int a[]=new int[5];
		int i,n,s=0,max=0,min=0,avg;
		Scanner x= new Scanner(System.in);
		System.out.println("Enter the values for array");
		for(i=0;i<5;i++)
		{
			System.out.println("Enter the value of "+i+" element");
			a[i]=x.nextInt();
		}
		for(i=0;i<5;i++)
		{
			System.out.println("The values are");
			System.out.println(+a[i]);
		}
		for(i=0;i<5;i++)
		{
			if(max<a[i])
			{
			max=a[i];	
			}
			min=max;
		}
		for(i=0;i<5;i++)
		{
			s=s+a[i];
			if(min>a[i])
			{
			min=a[i];
			}
		}
		avg=s/5;
		System.out.println("The sum of the values:"+s);
		System.out.println("The max of the values:"+max);
		System.out.println("The min of the values:"+min);
		System.out.println("The avg of the values:"+avg);
	}
}