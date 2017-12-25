import java.util.*;
import java.lang.*;
import java.io.*;

class Ideone
{
	public static void main (String[] args) throws java.lang.Exception
	{
		String word,uc,lc;
		Scanner in = new Scanner(System.in);
		System.out.println("enter the word:");
		word=in.nextLine();
		lc=word.toLowerCase();
		uc=word.toUpperCase();
		System.out.println("uppercase= "+uc+" lowercase= "+lc+"");
		
	}
}
