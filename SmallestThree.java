class SmallestThree{
	public static void main(String[] args) {
		int a =9,b=0,c=7;

		//System.out.print((a < b) ? (a < c ? a : c) : (b < c ? b : c)); 

		//System.out.print((a < b) ? (a < c ? " a is smallest among b and c" : " c is smallest among a and b") : (b < c ? " b is smallest among a and c" : " c is smallest among a and b")); 
		
		if(a<b && a<c)
			System.out.print("a is smallest among b and c");
		else if(b<a && b<c)
			System.out.print("b is smallest among a and c");
		else
			System.out.print("c is smallest among a and b");
	}
}
