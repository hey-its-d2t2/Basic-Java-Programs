/* A java prolgram to demonstrate the Hybrid Inheritance */
class A
{
	int a;
	A(){ a= 5; }
	void disp(){
		System.out.print("A = "+a);
	}
}
interface B
{
	int b = 10;
	void disp();
}
class C extends A implements B
{
	int c;
	C(){
		super();
		c = 15;
	}
	public void disp()
	{
		super.disp();
		System.out.println("B = "+b);
		System.out.println("C = "+c);
	}
}
class D extends C
{
	int d;
	D(){
		super();
		d = 20;
	}
	public void disp()
	{
		super.disp();
		System.out.println("D = "+d);
	}
}
class E extends C
{
	int e;
	E(){
		super();
		e = 25;
	}
	public void disp()
	{
		super.disp();
		System.out.println("E = "+e);
	}

}
class HybridInhEg
{
	public static void main(String[] args)
	{
		E p = new E();
		p.disp();
		D q = new D();
		q.disp();
		
	}
}