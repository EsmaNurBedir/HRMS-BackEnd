package bediryaz.l.m.hrms.business.abstracts;

import java.util.List;

import bediryaz.l.m.hrms.core.utilities.results.DataResult;
import bediryaz.l.m.hrms.core.utilities.results.Result;
import bediryaz.l.m.hrms.entities.concretes.Technology;

public interface TechnologyService {

	Result add(Technology technology);
	
	Result delete(int technologyId);
	
	DataResult<List<Technology>> getAll();
}
