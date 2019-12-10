package love.recursion;

public class RecursionWorks {
	public static void foo(int n)
	{
		if(n < 1)
		{
			System.out.println(0);;
		}
		else
		{
			 foo(n-1);
			 System.out.println("Hello world"+n);
		}
			
		
	}
	public static void main(String [] args)
	{
		foo(3);
		
	}
	

	
	
}
