package java_practice;

public class counting_char {

	public static void main(String[] args)
	{  
		int count=0;
		String value="java is a programming language";
		for(int i=0;i<=value.length()-1;i++)
		{
			for(int j=1;j<=value.length()-1;j++)
			{
				if(value.charAt(i)==value.charAt(j))
				{
					count=count+1;
                }
				
			}
			char ch=value.charAt(i);
			System.out.print(ch);
			System.out.println(" "+count);
			count=0;
		}
			
		
	}

}
