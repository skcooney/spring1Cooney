package beans;


public class Employee {
private long id;
private String employeeName;
private double rateOfPay;
private int yearsOfService;

public Employee() {
	super();
	// TODO Auto-generated constructor stub
}

public Employee(long id, String employeeName, double rateOfPay, int yearsOfService) {
	super();
	this.id = id;
	this.employeeName = employeeName;
	this.rateOfPay = rateOfPay;
	this.yearsOfService = yearsOfService;
}

public long getId() {
	return id;
}

public void setId(long id) {
	this.id = id;
}

public String getEmployeeName() {
	return employeeName;
}

public void setEmployeeName(String employeeName) {
	this.employeeName = employeeName;
}

public double getRateOfPay() {
	return rateOfPay;
}

public void setRateOfPay(double rateOfPay) {
	this.rateOfPay = rateOfPay;
}

public int getyearsOfService() {
	return yearsOfService;
}

public void setyearsOfService(int yearsOfService) {
	this.yearsOfService = yearsOfService;
}


}

