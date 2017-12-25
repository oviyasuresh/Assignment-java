import java.util.*;
import java.lang.*;
import java.io.*;

class Ideone
{
	public static void main (String[] args) throws java.lang.Exception
	{
		int i,num,fact=1;
		Scanner in = new Scanner(System.in);
		System.out.println("enter the number:");
		num = in.nextInt();
		if(num<0)
		{
			System.out.println("factorial does not exist for negative numbers");
		}
		else
		{
		for(i=1;i<=num;i++)
		{
			fact=fact*i;
		}
		System.out.println("the factorial of "+num+" is "+fact+"");
		}
	}
}
