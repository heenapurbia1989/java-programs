package java_practice;

public class Cal_static
{ 
	static int a;
	static int b;
	static int c;
	public static void main(String args[])
	{
		java.util.Scanner scn=new java.util.Scanner(System.in);
		System.out.println("enter the value of a and b");
	    a=scn.nextInt();
	    b=scn.nextInt();
	 
	 Cal_static.Addition();
	 Cal_static.subtraction();
	 Cal_static.multiplication();
	 Cal_static.division();
	}
    static void Addition()
	{
	    c=a+b;
       System.out.println("additon is="+c);
      
	}
	 static void multiplication()
	{
		  c=a*b;
       System.out.println("multiplication is="+c);
	}
	static void division()
	{
		if(a<b)
		{
		   int m=a;
		   a=b;
		   b=m;
		}
	     c=a/b;
       System.out.println("division is ="+c);
	}
	static void subtraction()
	{
		if(a<b)
		{
		   int m=a;
		   a=b;
		   b=m;
		}
		 c=a-b;
       System.out.println("subtraction ="+c);
	} 
	
	
}



