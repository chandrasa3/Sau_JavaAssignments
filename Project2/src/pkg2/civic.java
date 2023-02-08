package pkg2;

public class civic
{
public void colour()
	{
	System.out.println("I am child class");
	}
public static void main(String[] args)
{
civic C=new civic();
C.colour();
Honda H=new Honda();//has a relationship
H.price();
H.price=2000;
System.out.println("I am parent class" +H.price);
}
}
