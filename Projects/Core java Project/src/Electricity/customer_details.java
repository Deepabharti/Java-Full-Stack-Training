package Electricity;
import java.sql.*;
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class customer_details extends JFrame implements ActionListener{
	int i=0,j=0;
	JTable t1;
	JButton b1;
	String x[]= {"name","meterno.","address","state","city","email","phoneno"};
	String y[][]=new String[20][8];
	customer_details() {
		super("Customer Details");
		setSize(1200,650);
		setLocation(200,200);
		setResizable(false);
		try {
			connectionclass obj=new connectionclass();
			String q="select *from customer_info";
			ResultSet res=obj.stm.executeQuery(q);
			while(res.next()) {
				y[i][j++]=res.getString("name");
				y[i][j++]=res.getString("meterno");
				y[i][j++]=res.getString("address");
				y[i][j++]=res.getString("state");
				y[i][j++]=res.getString("city");
				y[i][j++]=res.getString("email_id");
				y[i][j++]=res.getString("phoneno");
				i++;
				j=0;
			}
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		
		t1 =new JTable(y,x);
		b1 =new JButton("print");
		add(b1,"South");
		JScrollPane sp=new JScrollPane(t1);
		add(sp);
		b1.addActionListener(this);
	}
	public void actionPerformed(ActionEvent ev) {
		
		if(ev.getSource()==b1)
		{
			try {
				t1.print();
			}
			catch(Exception ex) {
				ex.printStackTrace();
			}
		}
	}
	public static void main(String[] args) {
		
		new customer_details().setVisible(true);
	}
}
