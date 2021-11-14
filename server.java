import java.net.*;
import java.io.*;

class server
{
public static void main(String ar[])
{
try
{
ServerSocket ss = new ServerSocket(222);
Socket s =ss.accept();

DataInputStream dis = new DataInputStream(s.getInputStream());
 
String str = dis.readUTF();
System.out.println("Client Message :: "+str);
ss.close();
}
catch(Exception e)
{
System.out.println(e);
}
}
}