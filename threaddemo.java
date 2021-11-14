/* Multithraeding in java(M.imp)---->
Thread vs process
	*Thread is a lightweight sub process whereas Process 
is a heavyweight process






Multithreading can be accheived by two ways--

1- By extending the Thread class
2- By implementing Runnable interface
*/

class threaddemo extends Thread
{
public void run()
{
System.out.println("This is thread demo lectutre");

}

public static void main(String ar[])
{
threaddemo td = new threaddemo();

td.start();


}



}
