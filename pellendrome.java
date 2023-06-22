package interview_Question;

import java.util.Scanner;

public class Palllendrom
{

	public static void main(String[] args)
	{
		int i,j;
	    Scanner scn=new Scanner(System.in);
		
		System.out.println("enter any string");
		String str=scn.next();
		
		for( i=0,j=(str.length()-1);i<j; i++,j--)
		{
			if(str.charAt(i)==str.charAt(j))
		   {
				
				continue;
		   }
			else
			{
				System.out.println("String is not pallendrom");
				break;
			}
		}
			if(str.charAt(i)==str.charAt(j))
			   {
					System.out.println("String is pallendrom");
			   }
		
	System.out.println("enter any no");
	int n=scn.nextInt();
	int e,temp=n,rev=0;
	while(n>0)
	{
		e=n%10;
		rev=(rev*10)+e;
		n=n/10;
	}
	if(temp==rev)
	{
		System.out.println("no is pallendrom");
	}
	else
	{
		System.out.println("no is not pallendrom");
	}
	
}
}
