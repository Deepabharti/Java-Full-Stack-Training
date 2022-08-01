//package Salary;
public class HourlyEmployee extends Employee{
	
	private double hoursWorked;
	private double hourlyRate;
	
	public HourlyEmployee(){
		super();
	}

//	parmeter constructor to  instantiate hourlyemployee object

public HourlyEmployee(int employeeId, String firstName, String  lastName , double hoursWorked, double hourlyRate){
	super(employeeId,firstName,lastName);
	this.hourlyRate=hourlyRate;
	this.hoursWorked=hoursWorked;
}

//getter method for locat variables of this class

public double getHoursWorked(){
	return hoursWorked;
}
 public double  getHourlyRate()
 {
	 return hourlyRate;
 } 
 //setter methods 
 public void setHoursWorked(double hours){
	this.hoursWorked=hours;
}
 public void setHourlyRate(double rate)
 {
	 this.hourlyRate=rate;
 } 
 
 
 
 
 /*function calculate salary of an employee all the child class must override this function
 @return salary*/
 
 public double calculateSalary()
 {
	 double salary=0;
	 double overtime=0;
	 if(hoursWorked>40){
		 double hours=hoursWorked-40;
		 hoursWorked=40;
		 overtime=hours*(hourlyRate*1.5);
	 }
	 salary = hoursWorked * hourlyRate;
	 salary+= overtime;
	 return salary;
 }
 
 public String toString(){
		return  super.toString() + String.format("%-20s %.2f%n","Salary:" , calculateSalary());

	}
	
}
 
 