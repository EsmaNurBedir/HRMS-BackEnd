package bediryaz.l.m.hrms.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import bediryaz.l.m.hrms.business.abstracts.WorkExperienceService;
import bediryaz.l.m.hrms.core.utilities.results.DataResult;
import bediryaz.l.m.hrms.core.utilities.results.Result;
import bediryaz.l.m.hrms.core.utilities.results.SuccessDataResult;
import bediryaz.l.m.hrms.core.utilities.results.SuccessResult;
import bediryaz.l.m.hrms.dataAccess.abstracts.WorkExperienceDao;
import bediryaz.l.m.hrms.entities.concretes.WorkExperience;

@Service
public class WorkExperienceManager implements WorkExperienceService{

	private WorkExperienceDao workExperienceDao;
	
	@Autowired
	public WorkExperienceManager(WorkExperienceDao workExperienceDao) {
		super();
		this.workExperienceDao = workExperienceDao;
	}

	@Override
	public DataResult<List<WorkExperience>> getAll() {
		return new SuccessDataResult<List<WorkExperience>>(this.workExperienceDao.findAll());
	}

	@Override
	public DataResult<List<WorkExperience>> getAllByResumeIdOrderByEndYearOfWorkDesc(int id) {
		return new SuccessDataResult<List<WorkExperience>>(this.workExperienceDao.getAllByResumeIdOrderByEndYearOfWorkDesc(id));
	}

	@Override
	public Result add(WorkExperience workExperience) {
		this.workExperienceDao.save(workExperience);
		return new SuccessResult("WorkExperience added");
	}

	@Override
	public Result delete(int workExperienceId) {
		this.workExperienceDao.deleteById(workExperienceId);
		return new SuccessResult("WorkExperience deleted");
	}

}
