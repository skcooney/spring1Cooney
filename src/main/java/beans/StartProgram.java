package beans;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class StartProgram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		AnnotationConfigApplicationContext applicationContext = new	AnnotationConfigApplicationContext(BeanConfiguration.class);
				
		EmployeeService employeeService = applicationContext.getBean("employeeService", EmployeeService.class);
				
		System.out.println("Before Pay Increase");
		System.out.println(employeeService.getEmployee(1).getEmployeeName() + "'s hourly rate of pay: $" +employeeService.getEmployee(1).getRateOfPay());
		System.out.println(employeeService.getEmployee(2).getEmployeeName() + "'s hourly rate of pay: $" +employeeService.getEmployee(2).getRateOfPay());
				
		employeeService.changeRateOfPay(1, 2);
		employeeService.changeRateOfPay(2, 2);
		
		System.out.println("After Pay Increse");
		System.out.println(employeeService.getEmployee(1).getEmployeeName() + "'s hourly rate of pay: $" +employeeService.getEmployee(1).getRateOfPay());
		System.out.println(employeeService.getEmployee(2).getEmployeeName() + "'s hourly rate of pay: $" +employeeService.getEmployee(2).getRateOfPay());
		
		applicationContext.close();
	}

}
