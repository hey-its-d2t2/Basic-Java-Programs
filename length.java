// A Java program to find the length of charectors inputed by Command Line Argument
class length{
	public static void main(String[] args) {
		int l=0,i;
		for(i = 0;i<args.length;i++){
			l = args.length;
		}
		System.out.println("Arguments :- ");
		System.out.println("-------------------");
		for(i = 0;i<args.length;i++){
			System.out.println("["+i+"]"+" :: "+args[i]);
		}
		System.out.println("-------------------");
		System.out.println("Length :: "+l);
		System.out.println("-------------------");
	}
}