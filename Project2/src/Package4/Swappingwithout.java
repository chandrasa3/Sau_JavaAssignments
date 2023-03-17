package Package4;

import java.util.Scanner;

public class Swappingwithout 
{
public static void main(String[] args)
{
	int x,y;
	Scanner S=new Scanner(System.in);
	System.out.println("Enter value of x and y:");
	x=S.nextInt();
	y=S.nextInt();
	System.out.println("value of x and y before swapping " +x +" " +y);
	x=x+y;
	y=x-y;
	x=x-y;
	System.out.println("value of x and y after swapping " +x +" " +y);
	
	}
}
