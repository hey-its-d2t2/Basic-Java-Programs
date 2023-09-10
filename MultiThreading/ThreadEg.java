import java.lang.Thread;
class A extends Thread
{
	public void run()
	{
		for(int i = 0;i<=10;i++)
			System.out.println("i = "+i);
	}
}
class B extends Thread 
{
	public void run()
	{
		for(int j = 0 ;j<=20;j++)
			System.out.println("j = "+j);
	}
}
class C extends Thread
{
	public void run(){
		for (int k =0 ; k<=30;k++) 
			System.out.println("k = "+k);
	}
}
class ThreadEg
{
	public static void main(String[] args) {
		A a = new A();
		B b = new B();
		C c = new C();
		a.start();
		b.start();
		c.start();
	}
}