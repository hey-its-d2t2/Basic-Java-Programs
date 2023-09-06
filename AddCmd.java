//Taking input using Command Line Argument
class AddCmd{
	public static void main(String[] args) {
		int a = Integer.parseInt(args[0]);
		int b = Integer.parseInt(args[1]);
		int c = a+b;
		//System.out.print("Sum = "+c);
		System.out.print("The Sum of "+a+" and "+b+" is : "+c);
	}
}