import java.io.*;  
public class fileoutputstream {  
public static void main(String ar[]){    
   try
    {    
    FileOutputStream fo=new FileOutputStream("D:\\CSE.txt");    
    fo.write(65);    
    fo.close();    
    System.out.println("Printing...");    
     }
     catch(Exception e)
      {
      System.out.println(e);
	}    
      }    
}