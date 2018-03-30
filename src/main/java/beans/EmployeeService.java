package beans;

public interface EmployeeService {
	public void changeRateOfPay(long employeeId, double amount);
	public Employee getEmployee(long employeeId);

}