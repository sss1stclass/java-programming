
//Event Handling in JComboBox->

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

class comboevent implements ActionListener
{
JFrame f;
JPanel p;
JComboBox cb;

comboevent()
{
f=new JFrame();
p=new JPanel();
String c[]={"red","green","blue"};
cb=new JComboBox(c);

p.add(cb);
f.add(p);

cb.addActionListener(this);

f.pack();
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
if(s.equals("green"))
{
p.setBackground(Color.green);

}
if(s.equals("blue"))
{
p.setBackground(Color.blue);

}

}

public static void main(String ar[])
{
 comboevent ce=new comboevent();
}
}