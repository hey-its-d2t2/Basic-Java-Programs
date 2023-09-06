//Wap in java to read n numbers from CommandLine Argument and print their sum
class SumAvgCmd{
	public static void main(String[] args) {
		int a =0;
		for(int i=0;i<args.length;i++){
			a+=Integer.parseInt(args[i]);	
		}
		double avg = a/(args.length);
		System.out.println("Sum = "+a);
		System.out.println("Average = "+avg);
	}	
}