import java.util.*;
import java.lang.*;
import java.io.*;

class Main
{
	public static void main (String[] args) throws java.lang.Exception
	{
		int i,j,temp,n;
		Scanner in = new Scanner(System.in);
		System.out.println("enter the size of the array");
		n=in.nextInt();
		int array[]=new int [n];
		System.out.println("enter the array elements:");
		for(i=0;i<n;i++)
		{
			array[i]=in.nextInt();
		}
		for(i=0;i<n;i++)
		{
			for(j=i+1;j<n;j++)
			{
				if(array[i]>array[j])
				{
					temp=array[i];
					array[i]=array[j];
					array[j]=temp;
				}
			}
		
		}
		System.out.println("the sorted array is");
		for(i=0;i<n;i++)
		System.out.println(+array[i]);
		
		
		
	}
}
