import java.awt.*;

class awtdemo extends Frame{
awtdemo(){
Button b=new Button("Click here"){
b.setBounds(30,100,80,30);
add(b);
setSize(300,300);
setLayout(null);
setVisible(true);

}
public static void main(String args[]);
{
awtdemo f=new awtdemo();
}
}