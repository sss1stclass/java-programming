import javax.swing.*;
import java.awt.event.*;
import java.awt.*;

class calcdemo implements ActionListener
{
JFrame j;
JPanel p;
JLabel l1,l2,l3;
JTextField f1,f2,f3;
JButton b1,b2;

calcdemo()
{
j=new JFrame("claculator");
p=new JPanel();
l1=new JLabel("Enter your number");
l2=new JLabel("Enter your second number");
l3=new JLabel("Result");
f1=new JTextField(20);
f2=new JTextField(20);
f3=new JTextField(20);
b1=new JButton("Add");
b2=new JButton("Substraction");

p.add(l1);
p.add(f1);
p.add(l2);
p.add(f2);
p.add(l3);
p.add(f3);
p.add(b1);
p.add(b2);

j.add(p);

b1.addActionListener(this);
b2.addActionListener(this);

j.setSize(800,800);
j.setVisible(true);
j.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

}
public void actionPerformed(ActionEvent ae)
{
String s1=f1.getText();
String s2=f2.getText();

int a=Integer.parseInt(s1);
int b=Integer.parseInt(s2);

String m=ae.getActionCommand();

if(m.equals("Add"))
{
int c=a+b;
String x=String.valueOf(c);
f3.setText(x);
}
else
{
int d=a-b;
String y=String.valueOf(d);
f3.setText(y);
}

}
  
public static void main(String ar[])
{
calcdemo ca = new calcdemo();

}

}