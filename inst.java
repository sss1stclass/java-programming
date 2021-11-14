/*
class inst
{
public static void main(String ar[]){

inst a = new inst();
System.out.println(a instanceof inst);
}
}
*/

class base
{

}
class inst extends base{

static void get(base b)
{
inst in =(inst)b;
System.out.println("Downcasting is performed");
}
 public static void main(String ar[]){
inst i = new inst();
inst.get(i);
}
}
