package bediryaz.l.m.hrms.business.abstracts;

import java.util.List;

import bediryaz.l.m.hrms.core.utilities.results.DataResult;
import bediryaz.l.m.hrms.core.utilities.results.Result;
import bediryaz.l.m.hrms.entities.concretes.Education;

public interface EducationService {

	Result add(Education education);
	
	Result delete(int educationId);
	
	DataResult<List<Education>> getAll();
	
}
