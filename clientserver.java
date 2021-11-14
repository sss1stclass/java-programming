import java.net.*;
import java.io.*;

class clientserver
{
public static void main(String ar[])
{
try
{
Socket s = new Socket("localhost",222);

DataOutputStream dot = new DataOutputStream(s.getOutputStream());
dot.writeUTF("Hello server");

dot.flush();
dot.close();
s.close();

}
catch(Exception e)
{
System.out.println(e);
}
}
}