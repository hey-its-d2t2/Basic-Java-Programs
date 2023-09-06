class WrapperEg
{
	public static void main(String[] args)
	{
		int a=10;
		Integer p=a; //auto boxing - primitive to object - automatically conversion
		//Integer p=new Integer(a);
		
		System.out.println("a="+a+",p="+p);
		//int x=p.intValue(); //unboxing
		int x=p; //auto-unboxing - Object to primitive - automatically conversion
		System.out.println("x="+x);
		int b=12345;
		StringBuilder st=new StringBuilder(Integer.toString(b));
		System.out.println("st="+st+",length="+st.length());
		System.out.println("Reverse="+st.reverse());
		String sst="763";
		int c=Integer.parseInt(sst);
		System.out.println("c+100="+(c+100));
		int d=Integer.valueOf(sst);
		System.out.println(d+5);
	}
}