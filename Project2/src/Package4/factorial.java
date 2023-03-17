package Package4;

import java.util.Scanner;

public class factorial
{
public static void main(String[] args)
{
	int fact=1;
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter a number ");
	int num=sc.nextInt();
	System.out.println("Factorial is: ");
	
		for(int i=num;i>0;i--)
	{
		fact=fact *i;
		System.out.println(+i +"*" +fact);
		
	}
}
}