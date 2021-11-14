class methodover{
static int sum(int a, int b)
	{
		return a+b;
	{
 static double sum(double a, double b,double c)
	{
		return a+b+c;
	}
public static void main(String args[]){
System.out.println("This is method over riding concept\n\n");

	methodover mo=new methodover();
	System.out.println("The sum of first int is  " +mo.sum(2,3));
	System.out.println("The sum of second int is " +mo.sum(4,5,6));
}

}