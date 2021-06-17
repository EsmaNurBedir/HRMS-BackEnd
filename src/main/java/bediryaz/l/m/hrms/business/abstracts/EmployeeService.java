package bediryaz.l.m.hrms.business.abstracts;

import java.util.List;

import bediryaz.l.m.hrms.core.utilities.results.DataResult;
import bediryaz.l.m.hrms.core.utilities.results.Result;
import bediryaz.l.m.hrms.entities.concretes.Employee;


public interface EmployeeService {

	Result add(Employee employee);
	
	DataResult<List<Employee>> getByEmail(String email);
}
