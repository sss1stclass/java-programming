import java.io.*;
class fileinputstream
{
public static void main(String ar[])
{
try
{
FileInputStream fp= new FileInputStream("D:\\CSE.txt");
int i= 2;
while((i=fp.read())!=-1)
{
System.out.print((char)i);/*here we are using only print
				because  it will print the
				words without going to the
				next line*/
}
fp.close();
}
catch(Exception ae)
{
System.out.println(ae);
}
}
}