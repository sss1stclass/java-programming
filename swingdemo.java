import javax.swing.*;

class swingdemo
{
JFrame f;
JPanel p;
JLabel l1,l2;
JTextField t1;
JPasswordField t2;
JButton b1,b2;

swingdemo()
{
f=new JFrame("login form demo");
p=new JPanel();
l1=new JLabel("Enter your name");
l2=new JLabel("Enter your password");
t1=new JTextField(20);
t2=new JPasswordField(20);
b1=new JButton("login");
b2=new JButton("forget password");


p.add(l1);
p.add(t1);
p.add(l2);
p.add(t2);
p.add(b1);
p.add(b2);

f.add(p);

f.setSize(500,500);
f.setVisible(true);
f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
}
public static void main(String ar[]){
swingdemo sw=new swingdemo();
}

}