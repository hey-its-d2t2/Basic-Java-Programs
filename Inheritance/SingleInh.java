/** Example 01 - Singhle Inheritance */
class A
{
	int a;
	A()
	{
		a = 10;
	}
	A(int x)
	{
		a =x;
	}
	void disp()
	{
		System.out.print("A="+a);
	}
}
class B extends A
{
	int  b;
	B()
	{
		super();
		b = 20;
	}
	B(int x, int y)
	{
		super(x);
		b = y;
	}
	void disp()
	{
		super.disp();
		System.out.println(",B="+b);
	}
}
class SingleInh
{
	public static void main(String[] args) 
	{
		A p  = new A();
		A q  = new A(100);
		B r = new B();
		B s = new B(500,700);
		p.disp();
		System.out.println();
		q.disp();
		System.out.println("\n-----------------------");
		r.disp();
		s.disp();
		
	}
}