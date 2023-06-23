package java_practice;
class demo1
{
	//final method
	final void print()
	{
	  System.out.println("this is final print method");
	}
}
final class demo2 extends demo1
{
	//void print() not possible to extend final method
	void printf()
	{
		System.out.println("this is sub class printf method");
	}
	
}
//class demo3 extends demo2  not possible to extends final class


public class Final_keyword
{

	public static void main(String[] args)
	{
		//final variable
		final int a=10;
		System.out.println("velue of a is="+a);
		demo2 d=new demo2();
		d.print();
		d.printf();
		
	}

}
