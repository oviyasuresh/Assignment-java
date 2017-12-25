import java.util.*;
import java.lang.*;
import java.io.*;

class Ideone
{
	public static void main (String[] args) throws java.lang.Exception
	{
		int num,i,pow,mul=1;
		Scanner in = new Scanner(System.in);
		System.out.println("enter the number:");
		num = in.nextInt();
		System.out.println("enter the power:");
		pow = in.nextInt();
		for(i=0;i<pow;i++)
		{
			mul=mul*num;
		}
		System.out.println("the power of "+num+","+pow+" is "+mul+"");
		
		
	}
}
