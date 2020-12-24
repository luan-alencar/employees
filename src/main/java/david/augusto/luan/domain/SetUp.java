package david.augusto.luan.domain;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin(origins = "http://localhost:4200")
@RestController
public class SetUp {

	
	private static List<Employee> employees = createList();

	@RequestMapping(value = "/employees", method = RequestMethod.GET, produces = "application/json")
	public List<Employee> firstPage() {
		return employees;
	}

	public static List<Employee> createList() {
		List<Employee> teamEmployee = new ArrayList<>();
		Employee e1 = new Employee(1L, "emp1", "manager", 3000.00);
		Employee e2 = new Employee(2L, "emp2", "developer", 1800.00);
		Employee e3 = new Employee(3L, "emp3", "dbm", 1800.00);
		teamEmployee.addAll(Arrays.asList(e1,e2,e3));
		return teamEmployee;
	}

	public List<Employee> getEmployees() {
		return employees;
	}
}
