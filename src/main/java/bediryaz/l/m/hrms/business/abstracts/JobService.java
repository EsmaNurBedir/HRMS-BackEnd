package bediryaz.l.m.hrms.business.abstracts;

import java.util.List;

import bediryaz.l.m.hrms.core.utilities.results.DataResult;
import bediryaz.l.m.hrms.core.utilities.results.Result;
import bediryaz.l.m.hrms.entities.concretes.Job;

public interface JobService {

	Result add(Job job);
	
	Result update(Job job);
	
	Result delete(int jobId);
	
	DataResult<List<Job> > getAll();
	
	DataResult<List<Job>> getByActiveTrue();
	
	DataResult<List<Job>> getByActiveTrueAndEmployer_CompanyName(String companyName);
	
	DataResult<List<Job>> getByActiveTrueOrderByCreatedTimeDesc();
	
   DataResult<Job> getByIdAndActiveTrue(int id);
}
