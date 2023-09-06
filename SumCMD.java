/* A java program to find the sum of given n numbers by user, throug command line argument */
class SumCMD{
	public static void main(String[] args) {
		int sum = 0;
		for(int i= 0;i<args.length;i++){
				sum = sum+Integer.parseInt(args[i]);
		}
		System.out.println("Sum = "+sum);
		System.out.println("Length = "+args.length);
	}
}