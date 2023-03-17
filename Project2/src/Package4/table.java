package Package4;

import java.util.Scanner;

public class table
{
	public static void main(String[] args) 
	{
	Scanner s=new Scanner(System.in);
	System.out.println("enter the number a:");
	int a=s.nextInt();
	System.out.println("Table of " +a);
	for(int i=0;i<=10;i++)
	{
		int table=a*i;
				System.out.println( a +"*"+ i +"=" +table);
		
	}
	}

}
