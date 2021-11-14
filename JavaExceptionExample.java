/*class Exception{
public static void main(String ar[])
{
	int a=10,b=0,c;
	try{

	c=a/b;
	}
		catch(ArthematicException as){
		System.out.println(e);
}
}
System.out.println("hello everyone this is after try and except");
}*/
 class JavaExceptionExample{  
  public static void main(String args[]){  
   try{  
      
      int data=100/0;  
   }catch(ArithmeticException e){System.out.println(e);}  
    
   System.out.println("rest of the code...");  
  }  
}