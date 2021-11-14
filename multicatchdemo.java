class multicatchdemo
{
 	public static void main(String ar[])
	{
	  	int a=23,b=0,c;
		int d[]=new int[5];
		
	
	try
	 {
           c=a/b;
	   d[10]=50;
	 }
         catch(ArithmaticException e)
	{
		System.out.println("this is arthematic exception"+e);
	}
		catch(ArrayIndexOutOfBoundsException ae)
		{
			System.out.println("This is array error and handled"+ae);
		}
	
	
}

	  
	
}