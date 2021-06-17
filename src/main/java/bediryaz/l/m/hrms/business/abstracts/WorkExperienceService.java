package bediryaz.l.m.hrms.business.abstracts;

import java.util.List;

import bediryaz.l.m.hrms.core.utilities.results.DataResult;
import bediryaz.l.m.hrms.core.utilities.results.Result;
import bediryaz.l.m.hrms.entities.concretes.WorkExperience;

public interface WorkExperienceService {
	
	Result add(WorkExperience workExperience);
	
	Result delete(int workExperienceId);

	DataResult<List<WorkExperience>> getAll();
	
	DataResult<List<WorkExperience>> getAllByResumeIdOrderByEndYearOfWorkDesc(int id);
	
}
