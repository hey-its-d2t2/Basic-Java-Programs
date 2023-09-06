class Ab
{
	int a,b;
	Ab() //no argument constructor
	{
		a=10;
		b=20;
	}
	Ab(int x)
	{
		a=b=x;
	}
	Ab(int a,int b)
	{
		this.a=a;   
		this.b=b;
	}

	void disp()
	{
		System.out.println("a="+a+",b="+b);
	}
}
class AllInOne
{
	public static void main(String[] args)
	{
		Ab p=new Ab();
		Ab q=new Ab(12);
		Ab r=new Ab(50,100);
		p.disp();
		q.disp();
		r.disp();
	}
}