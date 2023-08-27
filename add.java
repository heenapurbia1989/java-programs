package interview_Question;

import java.util.Scanner;

public class Even_odd_no 
{

	public static void main(String[] args)
	{
		Scanner scn=new Scanner(System.in);
		System.out.println("enter any no");
		int n=scn.nextInt();
		if(n%2==0)
		{
			System.out.println("no is even="+n);
	    }
		else
		{
			System.out.println("no is odd="+n);
		}
	}

}
//this is odd/even programe
