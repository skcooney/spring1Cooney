package beans;

import org.springframework.stereotype.Component;

public class EmployeeServiceImpl implements EmployeeService {
	private EmployeeDao employeeDao;


	public EmployeeDao getEmployeeDao() {
		return employeeDao;

	}
	
	public void setEmployeeDao(EmployeeDao employeeDao) {
		this.employeeDao = employeeDao;
	}

		public void changeRateOfPay(long employeeId, double amount) {
		// TODO Auto-generated method stub
		Employee employee = employeeDao.find(employeeId);
		//System.out.println(employeeId);
		int tenure = 3;
		if(employee.getyearsOfService() > tenure) {
			employee.setRateOfPay(employee.getRateOfPay() + amount);
		//System.out.println("after amount" + amount);
		} else {
			employee.setRateOfPay(employee.getRateOfPay() + (amount/4));
			//System.out.println("after amount/4" + amount);
		}
		employeeDao.update(employee);
	}

	public Employee getEmployee(long employeeId) {
		// TODO Auto-generated method stub
		return employeeDao.find(employeeId);

	}

	

}
	
