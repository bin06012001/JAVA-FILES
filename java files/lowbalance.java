
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
class  xyz extends JFrame implements ActionListener{
    JTextField t1,t2,t3,t4;
    xyz()
    {
        JLabel l1=new JLabel("Name");
        t1=new JTextField(20);
        JLabel l4=new JLabel("Course");
        t4=new JTextField(10);
        JLabel l2=new JLabel("Section");
        t2=new JTextField(3);
        JLabel l3=new JLabel("Id");
        t3=new JTextField(10);
        Button b=new Button("submit");
        setLayout(new FlowLayout());
        add(l1);
        add(t1);
        add(l4);
        add(t4);
        add(l2);
        add(t2);
        add(l3);
        add(t3);
        b.addActionListener(this);
        add(b);
        
    }
    public void actionPerformed(ActionEvent e)
    {
        String n=t1.getText();
        String b=t4.getText();
        String c=t2.getText();
        String i=t3.getText();
    System.out.println("name : "+n);
    System.out.println("course : "+b);
    System.out.println("Section : "+c);
    System.out.println("Id : "+Integer.parseInt(i));
    }
public static void main(String[] args) {

    xyz d=new xyz();
    d.setSize(300,400);
    d.setVisible(true);
}
}
