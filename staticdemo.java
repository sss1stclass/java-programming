/*
static keywords in java

it is used for memory management purpose

java static property is shared among all the objects os class

class staticdemo
{
	int count=0;
	staticdemo()
	{
		count+=1;
		System.out.println(count);
		
	}

  public static void main(String ar[])
{
   staticdemo st1=new staticdemo();
   staticdemo st2=new staticdemo();
   staticdemo st3=new staticdemo();

	
}
	}
*/
class staticdemo
{
	static int count=0;
	 void get()
	{
		count+=1;
		System.out.println(count);
		
	}

  public static void main(String ar[])
{
   staticdemo st1=new staticdemo();
   staticdemo st2=new staticdemo();
   staticdemo st3=new staticdemo();
	st1.get();
	st2.get();
	st3.get();

	
}
	}