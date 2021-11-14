import java.util.*;
class listdemo
{
public static void main(String ar[])
{
ArrayList<String> al = new ArrayList<String>();

al.add("Sohil");
al.add("Aman");
al.add("Ankit");
al.add("Ankush");
 
System.out.println(al);
al.remove("Ankit");

System.out.println(al);
}
}