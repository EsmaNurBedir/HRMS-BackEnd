package bediryaz.l.m.hrms.business.abstracts;

import java.util.List;

import bediryaz.l.m.hrms.core.utilities.results.DataResult;
import bediryaz.l.m.hrms.core.utilities.results.Result;
import bediryaz.l.m.hrms.entities.concretes.Jobtitle;

public interface JobtitleService {

	Result add(Jobtitle jobTitle);
	
	Result delete(int jobtitleId);
	
	DataResult<List<Jobtitle>> getAll();
	
	DataResult<List<Jobtitle>> getByTitle(String title);
}
