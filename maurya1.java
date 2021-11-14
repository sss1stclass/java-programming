class sohil1 {
public void display(int n){
if(n<10){
System.out.println("\n yes");
}
//System.out.println("this is upper class method");
}
}
class maurya1 extends sohil1{
public static void main(String args[]){
maurya1 sh= new maurya1();
sh.display(15);
}

}


