import java.util.*;
import java.lang.*;
import java.io.*;
//package Salary;
public class Tester{
	public static void main(String[] args)
	{
		//create array of object of emoloyee class
		 Employee employees[]= new Employee[3];
		 
		employees[0] =new HourlyEmployee( 1, "Deepa","Bharti" , 45 ,19.95);
		employees[1] =new SalariedEmployee ( 2,  "Ridhi" ,"Sinha" ,7000 );
		employees[2] =new CommissionEmployee( 3, "Smita","Jha", 0.05 ,1500,100000);
       
	   // now we call tostring to display details 
	   for(int i=0;i<employees.length;i++)
	   {
		System.out.println (employees[i]);
        System.out.println ("\n");		
	   }
	}
}