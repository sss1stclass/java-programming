import java.net.*;

class inetdemo{
public static void main(String ar[]) throws Exception
{
InetAddress in = InetAddress.getByName("www.google.com");
System.out.println("ip add: " +in.getHostAddress());
System.out.println("Host Name :"+in.getHostName());
}
}