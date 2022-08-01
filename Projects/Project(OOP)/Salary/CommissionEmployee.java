//package Salary;
public class CommissionEmployee extends Employee{

private double commissionRate;
private double baseSalary;
private double totalSales;

public CommissionEmployee(){
	super();
}

public CommissionEmployee(int employeeId, String firstName, String  lastName,double rate ,double baseSalary , double totalSales)
{
	 super(employeeId,firstName, lastName);
     commissionRate=rate;
     this.baseSalary=baseSalary;
     this.totalSales=totalSales;
}
//getter methods 
public double getCommissionRate()
{
	return commissionRate;
}
public double getBaseSalary(){
	return this.baseSalary;
}
 public double getSales(){
	 return totalSales;
	
 }
 //setter methods
 public void setCommissionRate(double rate)
 {
 this.commissionRate=rate;
 }
 
 public void setBaseSalary(double salary)
 { 
 this.baseSalary=salary;
 }
 public void setSales(double sales)
 {
 this.totalSales=sales;
 }
  
 public double calculateCommission()
 {
	 return totalSales * commissionRate;
 }
 
 public double calculateSalary()
{
	return calculateCommission() + baseSalary;
}	
// @override
 public String toString()
	   {
		return  super.toString() +  String.format("%-20s %7.2f%n ","Salary:" , calculateSalary());
	   }

}