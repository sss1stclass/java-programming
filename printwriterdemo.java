import java.io.*;
class printwriterdemo
{
public static void main(String ar[]) throws IOException
{
PrintWriter pw = new PrintWriter(new File("D:\\CSE.txt"));
pw.write("hello this is print writer demo by sohil maurya");
pw.close();
System.out.println("printing in backend....");
}
}
