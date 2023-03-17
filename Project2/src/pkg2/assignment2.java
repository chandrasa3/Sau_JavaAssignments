package pkg2;

import java.util.Scanner;

public class assignment2
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
	public static void main(String[] args) {
		{
			System.out.println("Please enter data: ");
			Scanner S=new Scanner(System.in);
			int x1=S.nextInt();
			int x2=S.nextInt();
			int x3=S.nextInt();
			int x4=S.nextInt();
			int x5=S.nextInt();
			int x6=S.nextInt();
			assignment2 A=new assignment2();
			int mulresult=A.mul(x1,x2);
			System.out.println("mulresult is " +mulresult);
			int subresult1=A.sub(mulresult, x3);
			System.out.println("subresult1 is " +subresult1);
			int sumresult=A.sum(subresult1, x4);
			System.out.println("sumresult is " +sumresult);
			int subresult2=A.sub(sumresult, x5);
			System.out.println("subresult2 is " +subresult2);
			int divresult=A.div(subresult2, x6);
			System.out.println("divresult is " +divresult);
			
		}
	}
}
