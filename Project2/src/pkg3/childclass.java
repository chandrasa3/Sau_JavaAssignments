package pkg3;

public class childclass extends parentclass
	{
		public void method5()
		{
			System.out.println("Child default method");
		}
		public void method6(int a)
		{
			System.out.println("child 1 parametrized method");
		}
		public void method7(int a, int b)
		{
			super.method1();
			super.method3(33,64);
			super.method2(34);
			super.method4(45,32,22);
			System.out.println("child 2 parametrized method");
		}
		public void method8(int a, int b, int c)
		{
			this.method7(22,44);
			this.method5();
			this.method6(12);
			System.out.println("child 3 parametrized method");
		}
public static void main(String[] args) 
{
childclass obj=new childclass();
obj.method8(2,4,6);
}

}
