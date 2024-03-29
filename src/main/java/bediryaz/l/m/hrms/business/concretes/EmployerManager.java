package bediryaz.l.m.hrms.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import bediryaz.l.m.hrms.business.abstracts.EmployerService;
import bediryaz.l.m.hrms.core.utilities.results.DataResult;
import bediryaz.l.m.hrms.core.utilities.results.Result;
import bediryaz.l.m.hrms.core.utilities.results.SuccessDataResult;
import bediryaz.l.m.hrms.dataAccess.abstracts.EmployerDao;
import bediryaz.l.m.hrms.entities.concretes.Employer;

@Service
public class EmployerManager implements EmployerService{

	private EmployerDao employerDao;
	
	@Autowired 
	public EmployerManager(EmployerDao employerDao) {
		super();
		this.employerDao = employerDao;
	}

	@Override
	public Result add(Employer employer) {
		return this.add(employer);
	}

	@Override
	public DataResult<List<Employer>> getByEmail(String email) {
		return new SuccessDataResult<List<Employer>>(this.employerDao.getByEmail(email));
	}

	@Override
	public DataResult<List<Employer>> getAll() {
		return new SuccessDataResult<List<Employer>> (this.employerDao.findAll());
	}




}
