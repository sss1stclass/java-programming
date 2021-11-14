class Resource
{
public void showtable(int x)
{
try{
int i;
for(i=0;i<=10;i+=1)
{
System.out.println("THe table of "+x*i);
Thread.sleep(2000);
}
}
catch(Exception ae){
System.out.println(ae);
}
} 

}


class Thread1{
Resource re;
Thread1(Resource re){
this.re=re;
}
public void run(){

re.showtable(2);
}
}


class Thread2{
Resource re;

Thread2(Resource re){
this.re=re;
}
public void run(){
re.showtable(3);
}
}

class syncdemo{

public static void main(String ar[]){

Resource re =new Resource();
Thread1 th1= new Thread1(re);
Thread2 th2= new Thread2(re);
th1.start();
th2.start();
}
}
