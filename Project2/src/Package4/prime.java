package Package4;

import java.util.Scanner;

public class prime 
{
 public static void main(String[] args)
 {
	 int num, temp=0;
	 System.out.println("Enter a number greater than 2 : ");
	Scanner s=new Scanner(System.in);
	num=s.nextInt();
		for(int i=2;i<num;i++)
	{
		if (num%i==0)
		{
			temp=temp+1;
		}
	}

	if(temp==0)
		{
			
			System.out.println("number is prime");
		}
	else
	{
		System.out.println("number is not prime");
	}
	}
}
