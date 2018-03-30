package beans;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


public class EmployeeDaoInMemoryImpl implements EmployeeDao {
	private Map<Long, Employee>accountsMap = new HashMap<Long, Employee>();
	{
		Employee employee1 = new Employee(1L, "Sherri Cooney", 20.50, 5);
		Employee employee2 = new Employee(2L, "Jill Jones", 21.50, 3);
				
		accountsMap.put(employee1.getId(), employee1);
		accountsMap.put(employee2.getId(), employee2);
	}

	public void insert(Employee employee) {
		// TODO Auto-generated method stub
		accountsMap.put(employee.getId(), employee);
	}

	public void update(Employee employee) {
		// TODO Auto-generated method stub
		accountsMap.put(employee.getId(), employee);
	}

	public void update(List<Employee> employees) {
		// TODO Auto-generated method stub
		for(Employee employee: employees) {
			update(employee);
		}
	}

	public void delete(long employeeId) {
		// TODO Auto-generated method stub
		accountsMap.remove(employeeId);
	}

	public Employee find(long employeeId) {
		// TODO Auto-generated method stub
		return accountsMap.get(employeeId);
		
	}

	public List<Employee> find(List<Long> employeeIds) {
		List<Employee>employees = new ArrayList<Employee>();
		for(Long id: employeeIds) {
			employees.add(accountsMap.get(id));
	}
		return employees;
	}


	public List<Employee> find(String employeeName) {
		List<Employee>employees = new ArrayList<Employee>();
		for(Employee employee: accountsMap.values()) {
				if(employeeName.equals(employee.getEmployeeName())) {
					employees.add(employee);
				}
	}

		return employees;
	
		}	
		
	public List<Employee> find(int yearsOfService) {
		// TODO Auto-generated method stub
		List<Employee> employees = new ArrayList<Employee>();
		for(Employee employee: accountsMap.values()) {
			if(yearsOfService == employee.getyearsOfService()) {
				employees.add(employee);
			}
			
		}
			return employees;
			
		}
	}
