import java.util.*;
import java.lang.*;
import java.io.*;

class Factorial
{
static int factorial(int n)
{
if (n == 0)
return 1;
else
return(n * factorial(n-1));
}
public static void main(String args[])
{
int i,fact=1;
Scanner in = new Scanner(System.in);
System.out.println("enter the number");
int number=in.nextInt();
fact = factorial(number);
System.out.println("Factorial of "+number+" is: "+fact);
}
}
