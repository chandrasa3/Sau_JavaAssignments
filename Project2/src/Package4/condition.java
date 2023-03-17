package Package4;

import java.util.Scanner;

public class condition
{
	public static void main(String[] args)
	{
	System.out.println("enter a number: ");
		Scanner s=new Scanner(System.in);
	int a=s.nextInt();
	if (a%2==0)
	{
		System.out.println("number is even");
	}
	else
	{
		System.out.println("number is odd");
	}
	
	}

}
