package bediryaz.l.m.hrms.api.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import bediryaz.l.m.hrms.business.abstracts.EmployeeService;
import bediryaz.l.m.hrms.core.utilities.results.DataResult;
import bediryaz.l.m.hrms.entities.concretes.Employee;


@RestController
@RequestMapping(value="/api/employees")
public class EmployeesController {

	private EmployeeService employeeService;

	@Autowired
	public EmployeesController(EmployeeService employeeService) {
		super();
		this.employeeService = employeeService;
	}
	
	@PostMapping("/add")
	public ResponseEntity<?> add(@Valid @RequestBody Employee employee){
	return ResponseEntity.ok(this.employeeService.add(employee));
	}
	
	@GetMapping("/getByEmail")
	public DataResult<List<Employee>> getByEmail(String email){
		return this.employeeService.getByEmail(email);
	}
	
}
