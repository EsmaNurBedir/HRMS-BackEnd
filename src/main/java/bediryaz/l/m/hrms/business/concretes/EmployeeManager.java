package bediryaz.l.m.hrms.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import bediryaz.l.m.hrms.business.abstracts.EmployeeService;
import bediryaz.l.m.hrms.core.utilities.results.DataResult;
import bediryaz.l.m.hrms.core.utilities.results.Result;
import bediryaz.l.m.hrms.core.utilities.results.SuccessDataResult;
import bediryaz.l.m.hrms.core.utilities.results.SuccessResult;
import bediryaz.l.m.hrms.dataAccess.abstracts.EmployeeDao;
import bediryaz.l.m.hrms.entities.concretes.Employee;


@Service
public class EmployeeManager implements EmployeeService{

	private EmployeeDao employeeDao;
	@Autowired
	public EmployeeManager(EmployeeDao employeeDao) {
		super();
		this.employeeDao = employeeDao;
	}
	@Override
	public Result add(Employee employee) {
		this.employeeDao.save(employee);
		return new SuccessResult("işci eklendi");
	}
	@Override
	public DataResult<List<Employee>> getByEmail(String email) {
		return new SuccessDataResult<List<Employee>>(this.employeeDao.getByEmail(email),"email listelendi");
	}






}
