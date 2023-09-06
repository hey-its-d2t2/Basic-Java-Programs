class BitwiseEg
{
	public static void main(String[] args) 
	{
		int a=11,b=6,c,d,e,f,g,h,i,j;
		c=a&b;
		d=a|b;
		e=a^b;
		f=~a;
		g=~b;
		System.out.println("a="+a+"=>"+Integer.toBinaryString(a));
		System.out.println("b="+b+"=>"+Integer.toBinaryString(b));
		System.out.println("c="+c+"=>"+Integer.toBinaryString(c));
		System.out.println("d="+d+"=>"+Integer.toBinaryString(d));
		System.out.println("e="+e+"=>"+Integer.toBinaryString(e));
		System.out.println("f="+f+"=>"+Integer.toBinaryString(f));
		System.out.println("g="+g+"=>"+Integer.toBinaryString(g));
		System.out.println("Shift Operators");
		h=12<<3;
		i=-12>>3;
		j=-12>>>3;
		System.out.println("h="+h+"=>"+Integer.toBinaryString(h));
		System.out.println("i="+i+"=>"+String.format("%32s",Integer.toBinaryString(i)).replace(' ','0'));
		System.out.println("j="+j+"=>"+String.format("%32s",Integer.toBinaryString(j)).replace(' ','0'));
	}
	
}