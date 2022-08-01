//package Salary;
public abstract class Employee{
	//feilds
 private int employeeId;
 private String firstName;
 private String lastName;

 // default constructor
 public Employee() {
	 
 }
 //parameter constructor
  public Employee(int employeeId, String firstName , String lastName){
	  this.employeeId=employeeId;
	  this.firstName=firstName;
	  this.lastName=lastName;
  }
  
	//getter methods 
public int getEmployeeId()	
{
	return employeeId;
}
public String getFirstName(){
	return firstName;
}
public String getLastName(){
return lastName;
}
 //setter methods
 public void setEmployeeId(int id)	
{
	this.employeeId=id;
}
public void setFirstName(String name ){
	this.firstName=name;
}
public void setLastName(String name){
this.lastName=name;
}

//abstract method 
/** all child classes must override this function to provide polymorphism 
@return salary**/
public abstract double calculateSalary();
	
	
	//@override[
	
	public String toString(){
		
	return 	String.format("%-20s %d%n ", "Employee :  ", employeeId) +
	String.format("%-20s %s%n ", "Employee Name :", firstName + " " + lastName);
	}
	
}