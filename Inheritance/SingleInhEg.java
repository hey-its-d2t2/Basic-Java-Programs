/** Example of Single inheritance */
 class Ab
 {
 	int a,b;
 	Ab() //No argumet constructor
 	{
 		a= 10;b=20;
 	}
 	Ab(int x,int y) 	//Parameaterised Constructor // Cosnstructot Overloading
 	{
 		a = x;b = y; 
 	}
 	void ddisp() //Display Methoad
 	{
 		System.out.print("A = "+a+",B = "+b);
 	}
 	int sum()
 	{
 		return(a+b);
 	}
 	int sum(int x,int y) // methoad overloading
 	{
 		return(x+y);
 	}

 }
 class Abc extends Ab
 {
 	int c;
 	Abc()
 	{
 		c = 30;
 	}
 	Abc(int x,int y,int z)
 	{
 		super(x,y);
 		c = z; 
 	}
 	void disp() //Methoad overriding
 	{
 		Super.disp();
 		System.out.println(",C = "+c);
 	}
 	int sum()
 	{
 		return(super.sum()+c);
 	}
 	int sum(int x, int y, int z)
 	{ 
 		return(super.sum(x,y)+z);
 	}
 }
 class SingleInhEg
 {
 	public static void main(String[] args)
 	{
 		Ab p = new Ab();
 		Ab q = new Ab(40,50);
 		Abc r = new Abc();
 		Abc  s = new Abc(60,70,80);
 		p.disp();
 		System.out.println("Sum = "+p.sum());
 		System.out.println("Sum = "+p.sum(90,100));
 		q.disp();
 		System.out.println("Sum = "+q.disp());
 		System.out.println("sum = "+q.disp(110,120));
 		r.disp();
 		System.out.println("Sum = "+r.disp());
 		System.out.println("Sum = "+r.disp(130,140));
 		s.disp();
 		System.out.println("Sum = "+s.disp());
 		System.out.println("Sum = "+s.disp(150,160));
 	}
 }