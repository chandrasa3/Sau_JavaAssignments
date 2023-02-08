package pkg2;

public class Jazz extends Honda//is a relationship
{
int model;
public void modeltype()
{
	System.out.println("I am chlild class");
}
public static void main(String[] args)
{
Jazz J=new Jazz();
J.model=123;
System.out.println("model number is" +J.model);
J.modeltype();
J.price();
}
}
