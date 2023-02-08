package pkg2;

import java.util.Scanner;

public class Assignment1 
{
	public int sum(int a, int b)
	{
		int c=a+b;
		return c;
	}
	public int sub(int a, int b)
	{
		int c=a-b;
		return c;
	}
	public int mul(int a, int b)
	{
		int c=a*b;
		return c;
	}
	public int div(int a, int b)
	{
		int c=a/b;
		return c;
	}
	public static void main(String[] args) 
	{
		System.out.println("Please enter data: ");
		Scanner S=new Scanner(System.in);
		int x1=S.nextInt();
		int x2=S.nextInt();
		int x3=S.nextInt();
		int x4=S.nextInt();
		int x5=S.nextInt();
		int x6=S.nextInt();
		Assignment1 A=new Assignment1();
		int sumresult1=A.sum(x1,x2);
		System.out.println("sumresult1 is " +sumresult1);
		int sumresult2=A.sum(sumresult1, x3);
		System.out.println("sumresult2 is " +sumresult2);
		int subresult=A.sub(sumresult2, x4);
		System.out.println("subresult is " +subresult);
		int mulresult=A.mul(subresult, x5);
		System.out.println("mulresult is " +mulresult);
		int divresult=A.div(mulresult, x6);
		System.out.println("divresult is " +divresult);
		
		
		
	}

}
