import java.util.Vector;
class VectorEg
{
	public static void main(String[] args)
	{
		Vector v=new Vector(3);
		v.addElement(10);
		v.addElement("Hello");
		v.addElement(30);
		v.addElement(40);
		v.addElement(30);
		v.addElement(60);
		for(int i=1;i<12;i++) v.addElement(i); 
		System.out.println(v);
		System.out.println(v.elementAt(1));
		System.out.println("Size="+v.size());
		System.out.println("Capacity="+v.capacity());
		v.removeElement(30);
		System.out.println(v);
		v.removeElementAt(1);
		System.out.println(v);
		v.insertElementAt("DCC",2);
		System.out.println(v);
		
	}
}