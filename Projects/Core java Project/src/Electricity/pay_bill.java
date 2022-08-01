package Electricity;
import java.sql.*;
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class pay_bill extends JFrame implements ActionListener {
	JLabel l1,l2,l3,l4,l5;
	JButton b1,b2;
	JTextArea t1;
	JPanel p1,p;
	Font f;
	Choice c1,c2;
	
	pay_bill(){
		super("Pay Bill");
		setSize(1000,400);
		setLocation(200,200);
		setResizable(false);
		f=new Font("senserif",Font.BOLD,15);
		l1=new JLabel("Meter no");
		l2=new JLabel("Month");
		l3=new JLabel("Units Consumed");
		l4=new JLabel("Calculate electricity bill");
		//l5.setHorizontalAlignment(JLabel.CENTER);
		l1.setFont(f);
		l2.setFont(f);
		l3.setFont(f);
		//l5.setFont(f);
		
		c1=new Choice();
		c1.add("1001");
		c1.add("1002");
		c1.add("1003");
		c1.add("1004");
		c1.add("1005");
		c1.add("1006");
		c1.add("1007");
		c1.add("1008");
		c1.add("1009");
		c1.add("1010");
		c1.setFont(f);
		
		c2=new Choice();
		c2.add("January");
		c2.add("February");
		c2.add("March");
		c2.add("April");
		c2.add("May");
		c2.add("June");
		c2.add("July");
		c2.add("August");
		c2.add("September");
		c2.add("October");
		c2.add("November");
		c2.add("December");
		c2.setFont(f);
		
		t1=new JTextArea();
		t1.setFont(f);
		
		b1=new JButton("Submit");
		b2=new JButton("Cancel");
		
		b1.setBackground(Color.BLACK);
		b1.setBackground(Color.WHITE);
		b2.setBackground(Color.BLACK);
		b2.setBackground(Color.WHITE);
		b1.setFont(f);
		b2.setFont(f);
		
		b1.setSize(50,50);
		p=new JPanel();
		p.setLayout(new GridLayout(4,2,30,30));
		p.add(l1);
		p.add(c1);
		p.add(l2);
		p.add(c2);
		p.add(l3);
		p.add(t1);
		p.add(b1);
		p.add(b2);
		p1=new JPanel();
		p1.setLayout(new GridLayout(1,1));
		//image in l4
		l4=new JLabel();
		p1.add(l4);
		
		setLayout(new BorderLayout(30,30));
		//add(l5,"North");
		add(p1,"West");
		add(p,"Center");
		b1.addActionListener(this);
		b2.addActionListener(this);
	}
		
		public void actionPerformed(ActionEvent ev) {
			if(ev.getSource()==b1) {
			
		try {
			connectionclass obj=new connectionclass();
			String meter=c1.getSelectedItem();
			String month=c2.getSelectedItem();
			int units=Integer.parseInt(t1.getText());
			int amount=(units*7)+98+42+112+48;
			String q="insert into bill values('"+meter+",'"+month+"','"+units+"','"+amount+"')";
			obj.stm.executeUpdate(q);
			JOptionPane.showMessageDialog(null,"Data successfully inserted");
			 setVisible(false);
	}
		catch(Exception ex) {
			ex.printStackTrace();
		}
		if(ev.getSource()==b2) {
			JOptionPane.showMessageDialog(null,"You pressed cancel");
			 setVisible(false);
		}
			}
		}
		public static void main(String[] args) {
			new pay_bill().setVisible(true);
		}

}
