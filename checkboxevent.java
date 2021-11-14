
import javax.swing.*;

class checkboxevent
{
JFrame j;
JPanel p;
JCheckBox c1,c2;
JLabel l1,l2;

checkboxevent()
{
j=new JFrame("checkbox event");
p=new JPanel();
l1=new JLabel("java");
l1=new JLabel("python");
c1=new CheckBox();
c2=new CheckBox();
p.add(l1);
p.add(c1);
p.add(l2);
p.add(c2);

f.add(p);


f.setSize(500,500);
f.setVisible(true);		
}
public static void main(String ar[])
{
checkboxevent ce= new checkboxevent();
}
}