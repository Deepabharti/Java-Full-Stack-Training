package Electricity;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.sql.*;
public class loginpage extends JFrame implements ActionListener{
	 JLabel l1,l2,l3;
	JTextField t1;
	JButton b1,b2;
	JPanel p1,p2,p3,p4;
	JPasswordField t2;
	loginpage()
	{
		super("Login Page");
		setSize(400,250);
		setResizable(false);
		setLocation(300,300);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		//ImageIcon img1=new ImageIcon("C:\\Users\\Deepa.bharti\\Documents\\workspace-spring-tool-suite-4-4.14.0.RELEASE\\Electricity_billing_system\\src\\Electricity.icons/images.jfif");
		//setIconImage(img1.getImage());
		l1 = new JLabel("username");
		l2 = new JLabel("password");
		//ImageIcon i1=new ImageIcon(ClassLoader.getSystemResource("C:\\Users\\Deepa.bharti\\Desktop\\Electricity icons\\image.jfif"));
	    //Image img= i1.getImage().getScaledInstance(120,140,Image.SCALE_DEFAULT);
		//ImageIcon i2=new ImageIcon(img);
		//l2=new JLabel();
		t1=new JTextField(15);
		t2=new JPasswordField(15);
      /*  ImageIcon i3=new ImageIcon(ClassLoader.getSystemResource("C:\\Users\\Deepa.bharti\\Desktop\\Electricity icons\\tick.png"));
		Image img2= i3.getImage().getScaledInstance(16,16,Image.SCALE_DEFAULT);
		b1=new JButton("Login",new ImageIcon(img2));
		
		Image img3= i3.getImage().getScaledInstance(16,16,Image.SCALE_DEFAULT);
		b2=new JButton("Cancel",new ImageIcon(img3));*/
		b1=new JButton("Login");
		b2=new JButton("cancel");
		Font f=new Font("Arial",Font.BOLD,16);
		l1.setFont(f);
		l2.setFont(f);
		b1.setFont(f);
		b2.setFont(f);
		t1.setFont(f);
		t2.setFont(f);
		
		//panel objects
		
		p1=new JPanel();
		p2=new JPanel();
		p3=new JPanel();
		p4=new JPanel();
        setLayout(new BorderLayout());
        p2.add(l1);
        p2.add(t1);
        p2.add(l2);
        p2.add(t2);
        add(p2,BorderLayout.CENTER);
        //p1.add(l3);
        add(p1,BorderLayout.WEST);
        p3.add(b1);
        p3.add(b2);
        add(p3,BorderLayout.SOUTH);
        b1.addActionListener(this);
        b2.addActionListener(this);
	}
        public void actionPerformed(ActionEvent ev) {
        	try {
        		Class.forName("com.mysql.jdbc.Driver");
        		Connection cn = DriverManager.getConnection("jdbc:mysql://localhost:3306/billing","root","root");
        	 if(ev.getSource()==b1) {
        		 String name=t1.getText();
        		 String pass=t1.getText();
        		 String q="select *from logindate where username = '"+name+"' and password='"+pass+"'";
        				 Statement stm=cn.createStatement();
        		 ResultSet set=stm.executeQuery(q);
        		 if(set.next()) {
        			 new homepage().setVisible(true);
        			 this.setVisible(false);
        		 }
        		 else {
        			 JOptionPane.showMessageDialog(null,"invalid login");
        		 }
        	 }
        	 else {
        		 
        		 JOptionPane.showMessageDialog(null,"sorry your pressed cancel button");
        		 setVisible(false);
        		 
        	 }
        }
        	catch(Exception e)
        	{
        		e.printStackTrace();
        		System.out.println("error");
        	} 
        }
        public static void main(String[] args) {
        	
        	new loginpage().setVisible(true);
        }
        
		
		
	
		
		
		
	}
	

