/** A java program to find the CI and SI,
 * using class, object, constructor and method
 * @param p Prise for argeumeted constructor
 * @param r Rate for argumented constructor
 * @param t Time for argumented constructor
 * @return not returns any value
 * @author DEEPAK SINGH 
 */
import java.util.Scanner;
class Calculate{
	double price, rate, time;
	double ci,si;
	Calculate(){
		ci = 0.0;
		si = 0.0;
	}
	Calculate(double p, double r, double t){
		price = p;
		rate = r;
		time = t;
	}
	//Input and Output function defentaion
	public void input(){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the principal amount : ");
		price = sc.nextDouble();
		System.out.print("Enter interest rate : ");
		rate = sc.nextDouble();
		System.out.print("Enter time(years) : ");
		time = sc.nextDouble();
	}
	//Clalculate function
	void calc(){
		si =(price * time * rate)/100;
		ci = price * Math.pow(1.0+rate/100.0,time) - price;
	}
	public void output(){
		calc();
		System.out.println("Simple Interest : "+si);
		System.out.println("Compound Interest : "+ci);
	}
}
class CISI{
	public static void main(String[] args) {
		Calculate c = new Calculate(1000,1,1);
		c.output();
		c.input();
		c.output();
	}
}