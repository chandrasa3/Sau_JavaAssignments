package pkg3;

public class Selenium extends Automation
{
public Selenium()
{
	this(23,25);
	
	System.out.println("Child class default constructor");
	}
public Selenium(int a)
	{
		this(2,4,6);
	
		System.out.println("Child class one parametrized constructor");
	}
public Selenium(int a, int b)
{
	super(12,13);
			System.out.println("Child class two parametrized constructor");
}
public Selenium(int a, int b, int c)
{
	this();
		System.out.println("Child class three parametrized constructor");
}
public static void main(String[] args)
{
Selenium S=new Selenium(20);
}
}
