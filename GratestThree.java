//Gratest among three numbers
class GratestThree{
	public static void main(String[] args) {
		int a =1,b =20, c=9;

		//System.out.print((a > b) ? (a > c ? a : c) : (b > c ? b : c)); 

		//System.out.print((a > b) ? (a > c ? " a is grater than b and c" : " c is grater than a and b") : (b > c ? " b is grater than a and c" : " c is grater than a and b")); 
		
		if(a >b && a>c)
			System.out.print("a is grater than b and c");
		else if(b>a && b>c)
			System.out.print("b is grater than a and c");
		else
			System.out.print("c is grater than a and b");

	}
}