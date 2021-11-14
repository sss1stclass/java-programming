class threadsleep extends Thread
{
public void run()
{
int i;
for(i=1;i<=10;i+=1)
{
 try
 {
 Thread.sleep(2000);
 }
 catch(InterruptedException ie)
 {
 System.out.println(ie);
 }
	System.out.println("The name of the thread is "
+ Thread.currentThread().getName());
System.out.println(2*i);
}

}
public static void main(String ar[])
{
threadsleep th1 = new threadsleep();
threadsleep th2 = new threadsleep();
th1.start();
th2.start();
th1.setName("Sohil");
th2.setName("Aman");
}
}