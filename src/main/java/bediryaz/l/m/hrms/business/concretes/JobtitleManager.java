package bediryaz.l.m.hrms.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import bediryaz.l.m.hrms.business.abstracts.JobtitleService;
import bediryaz.l.m.hrms.core.utilities.results.DataResult;
import bediryaz.l.m.hrms.core.utilities.results.Result;
import bediryaz.l.m.hrms.core.utilities.results.SuccessDataResult;
import bediryaz.l.m.hrms.core.utilities.results.SuccessResult;
import bediryaz.l.m.hrms.dataAccess.abstracts.JobtitleDao;
import bediryaz.l.m.hrms.entities.concretes.Jobtitle;

@Service
public class JobtitleManager implements JobtitleService{

	private JobtitleDao jobTitleDao;
	
	@Autowired
	public JobtitleManager(JobtitleDao jobTitleDao) {
		super();
		this.jobTitleDao = jobTitleDao;
	}

	@Override
	public Result add(Jobtitle jobTitle) {
		this.jobTitleDao.save(jobTitle);
		return new SuccessResult("Jobtitle Eklendi");
	}

	@Override
	public DataResult<List<Jobtitle>> getAll() {
		return new SuccessDataResult<List<Jobtitle>>(this.jobTitleDao.findAll());
	}

	@Override
	public DataResult<List<Jobtitle>> getByTitle(String title) {
		return new SuccessDataResult<List<Jobtitle>>(this.jobTitleDao.getByTitle(title));
	}

	@Override
	public Result delete(int jobtitleId) {
		this.jobTitleDao.deleteById(jobtitleId);
		return new SuccessResult("Jobtitle deleted");
	}

}
