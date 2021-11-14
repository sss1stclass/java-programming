import java.util.*;

class get_input_demo
{
	public static void main(String ar[])
	{
	Scanner myobj= new Scanner(System.in);
	System.out.print("Enter username");

	String username = myobj.nextLine();
        System.out.println("username is: " + username);
	int age = myobj.nextInt();
	
	System.out.println("The intger is " +age);
	}
}