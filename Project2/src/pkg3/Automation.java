package pkg3;

public class Automation
{
public Automation()
{
	this(22,44,66);
	System.out.println("Parent default constructor");
}
public Automation(int a)
{
	this();
	System.out.println("Parent one parametrized constructor");
}
public Automation(int a, int b)
{
	this(12);
	System.out.println("Parent two parametrized constructor");
}
public Automation(int a, int b, int c)
{
	System.out.println("Parent three parametrized constructor");
}

}
