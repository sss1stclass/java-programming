import java.util.*;
class stackdemo
{
public static void main(String ar[])
{
Stack<String> st = new Stack<String>();
st.push("Sohil");
st.push("Ankit");
st.push("Aryan");
st.push("Aman");
System.out.println("\n"+st);
st.peek();
System.out.println("The element at the peek is "+st.peek());
st.pop();
System.out.println(st);
}
}