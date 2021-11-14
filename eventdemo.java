import javax.swing.*;
import java.awt.event.*;

class eventdemo implements ActionListener{
JFrame f;
JPanel p;
JLabel l1,l2;
JTextField t1,t2;
JButton b1,b2;

eventdemo(){
f=new JFrame("Event handeling demo");
p=new JPanel();
l1=new JLabel("Enter name");
t1=new JTextField(20);
l2=new JLabel("Enter your age");
t2=new JTextField(20);
b1=new JButton("click");
b2=new JButton ("Clear");


p.add(l1);
p.add(t1);

p.add(l2);
p.add(t2);
p.add(b1);
p.add(b2);


f.add(p);
b1.addActionListener(this);
b2.addActionListener(this);
f.setSize(500,500);
f.setVisible(true);
f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
}
public void actionPerformed(ActionEvent ae){

String s1=ae.getActionCommand();
if(s1.equals("click"))
  {
	t1.setText("Sohil Maurya");
	t2.setText("18 years");
  }
else
  {
	t1.setText("");
	t2.setText("");
  }
}
public static void main(String ar[]){
eventdemo ev=new eventdemo();
}
}