import java.util.*;
import java.lang.*;
import java.io.*;

class Ideone
{
	public static void main (String[] args) throws java.lang.Exception
	{
		int a,b;
		Scanner in = new Scanner(System.in);
		System.out.println("enter the two numbers:");
		a=in.nextInt();
		b=in.nextInt();
		System.out.println("before swapping:");
		System.out.println("a="+a+" b="+b+"");
		a=a+b;
		b=a-b;
		a=a-b;
		System.out.println("after swapping");
		System.out.println("a="+a+" b="+b+"");
	}
}
