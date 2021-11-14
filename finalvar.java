/*
FINAL KEYWORDS IN JAVA

Final keyword is used to rerstrict the user
 final can be used in 3 different ways
1- Method
2- variable
3- cllass

lets take variable keyword... it says that any variable taken as final cannot be changed 
lets understand with code
*/
 class finalvar{
	final int x=10;
		public void get()
   {
      int x=20;
	System.out.println("The final outputs of the program is "+x);

   }
public static void main(String ar[])
	{
 		finalvar fv=new finalvar();
		fv.get();
	}
}