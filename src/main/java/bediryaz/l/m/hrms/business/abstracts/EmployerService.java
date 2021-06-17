package bediryaz.l.m.hrms.business.abstracts;

import java.util.List;

import bediryaz.l.m.hrms.core.utilities.results.DataResult;
import bediryaz.l.m.hrms.core.utilities.results.Result;
import bediryaz.l.m.hrms.entities.concretes.Employer;


public interface EmployerService {

	Result add(Employer employer);
	
   DataResult< List<Employer>> getByEmail(String email);
    
  DataResult<List<Employer>> getAll();
}
