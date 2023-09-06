//smallest between two number
class SmallerTwo
{
	public static void main(String[] args) {
		int a = 5, b=3;
		//System.out.print("Smallest : "+((a<b)?a:b));
		//System.out.print(((a<b)?"a is smallest" : "b is smallest"));
		if(a<b)
			System.out.print("a is smaller than b");
		else
			System.out.print("b is smaller than a");
	}
}