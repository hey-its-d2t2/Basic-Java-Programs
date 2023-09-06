abstract class A
{
	static void show()
	{
		System.out.println("Method of Base Class");
	}
	abstract void disp();
}
class B extends A 
{
	int b;
	B()
	{
		b=10;
	}
	void disp()
	{
		System.out.println("b="+b);
	}
}
class AbstractEg
{
	public static void main(String[] args) 
	{
		B p=new B();
		p.disp();
		A.show();
	}
}