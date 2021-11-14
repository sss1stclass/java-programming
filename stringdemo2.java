class stringdemo2{
public static void main(String args[])
{
String str1= "First string";
String str2 = "Second string";
String str = str1;
System.out.println("length of string1" + str1.length());

System.out.println("Char at index of str2 is : " + str2.charAt(3));

if(str1.equals(str2)){
System.out.println("str1== str2");
}
else
{
System.out.println("str1!=str2");
}
if(str.equals(str1)){
System.out.println("str==str1");
}
else{
System.out.println("str	!= str1");
}
}
}