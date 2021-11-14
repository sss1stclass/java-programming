import javax.swing.*;
import java.awt.*;
import java.awt.event.*;


class combodemo implements ActionListener{
JFrame f;
JPanel p;
JLabel l;
JTextField t;
JComboBox cb;
JButton b;

combodemo(){
f=new JFrame("COMBO DEMO");
p=new JPanel();
l=new JLabel("Enter your name here");
t= new JTextField(20);
String c[]={"red","blue","yellow"};
cb= new JComboBox(c);
b=new JButton("Click here");

p.add(l);
p.add(t);
p.add(cb);
p.add(b);

p.setBackground(Color.cyan);

cb.addActionListener(this);
f.add(p);
f.setSize(500,500);
f.setVisible(true);

f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
}
public void actionPerformed(ActionEvent ae)
{
String s=(String)cb.getSelectedItem();

if(s.equals("red"))
{
p.setBackground(Color.red);
}

if(s.equals("blue"))
{
p.setBackground(Color.blue);
}

if(s.equals("yellow"))
{
p.setBackground(Color.yellow);
}

}
public static void main(String ar[]){
combodemo cd = new combodemo();
}
}