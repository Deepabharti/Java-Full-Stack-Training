package Electricity;
import java.sql.*;
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class homepage extends JFrame implements ActionListener {
JLabel l1;
homepage(){
	super("Electricity Billing System");
	setSize(1600,690);
 // ImageIcon i2=new ImageIcon(ClassLoader.getSystemResource("D:\\backgroundimage.png"));
  //Image i3=i2.getImage().getScaledInstance(1600, 690, Image.SCALE_DEFAULT);
   //ImageIcon icc=new ImageIcon(i3);
    l1=new JLabel();
    add(l1);
    
    JMenuBar mb=new JMenuBar();
    JMenu master=new JMenu("Master");
    JMenuItem mi1=new JMenuItem("New Customer");
    JMenuItem mi2=new JMenuItem(" Customer Details");
    master.setForeground(Color.BLUE);
    Font f=new Font("monoSpaced",Font.PLAIN,16);
   
    mi1.setFont(f);
    mi1.setMnemonic('D');
    mi1.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_D,ActionEvent.CTRL_MASK));
    mi1.setBackground(Color.white);
    
    mi2.setFont(f);
    mi2.setMnemonic('M');
    mi2.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_M,ActionEvent.CTRL_MASK));
    mi2.setBackground(Color.white);
    
    mi1.addActionListener(this);
    mi2.addActionListener(this);
    
    JMenu user=new JMenu("User");
    JMenuItem ui1=new JMenuItem("pay bill");
    
    ui1.setFont(f);
    ui1.setMnemonic('P');
    ui1.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_P,ActionEvent.CTRL_MASK));
    ui1.setBackground(Color.white);
    
    ui1.addActionListener(this);
    
    
    JMenu report=new JMenu("Report");
    JMenuItem r1=new JMenuItem("Generate bill");
    
    r1.setFont(f);
    r1.setMnemonic('R');
    r1.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_R,ActionEvent.CTRL_MASK));
    r1.setBackground(Color.white);
    
    r1.addActionListener(this);
    
    
    JMenu exit=new JMenu("Exit");
    JMenuItem ex=new JMenuItem("Exit");
    
    ex.setFont(f);
    ex.setMnemonic('Z');
    ex.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_Z,ActionEvent.CTRL_MASK));
    ex.setBackground(Color.white);
    
    ex.addActionListener(this);
    
    master.add(mi1);
    master.add(mi2);
    
    user.add(ui1);
   
    report.add(r1);
    exit.add(ex);
     mb.add(master);
     mb.add(user);
     mb.add(report);
     mb.add(exit);
     
     setJMenuBar(mb);
     setFont(new Font("Senserif",Font.BOLD,16));
     setLayout(new FlowLayout());
     setVisible(false);
}
public void actionPerformed(ActionEvent ev) {
	
    String msg=ev.getActionCommand();
    if(msg.equals("New Customer"))
    {
    	new new_customer().setVisible(true);
    }
    else if(msg.equals("Customer Details"))
    {
    	new customer_details().setVisible(true);
    }
    else if(msg.equals("Pay bill")) {
    	new pay_bill().setVisible(true);
    }
    else
    {
    	System.out.println("wrong");
    }
}
public static void main(String[] args)
{
	new homepage().setVisible(true);
    
}

}
