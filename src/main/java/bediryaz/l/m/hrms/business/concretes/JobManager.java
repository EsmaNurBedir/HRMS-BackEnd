package bediryaz.l.m.hrms.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import bediryaz.l.m.hrms.business.abstracts.JobService;
import bediryaz.l.m.hrms.core.utilities.results.DataResult;
import bediryaz.l.m.hrms.core.utilities.results.Result;
import bediryaz.l.m.hrms.core.utilities.results.SuccessDataResult;
import bediryaz.l.m.hrms.core.utilities.results.SuccessResult;
import bediryaz.l.m.hrms.dataAccess.abstracts.JobDao;
import bediryaz.l.m.hrms.entities.concretes.Job;

@Service
public class JobManager implements JobService{

	private JobDao jobDao;
	
	
	@Autowired
	public JobManager(JobDao jobDao) {
		super();
		this.jobDao = jobDao;
	}

	@Override
	public Result add(Job job) {
          this.jobDao.save(job);
          return new SuccessResult();
	}

	@Override
	public DataResult<List<Job>> getAll() {
          return new SuccessDataResult<List<Job>>(this.jobDao.findAll(),"Meslekler listelendi");
	}

	@Override
	public DataResult<List<Job>> getByActiveTrue() {
       return new SuccessDataResult<List<Job>>(this.jobDao.getByActiveTrue());
	}

	@Override
	public DataResult<List<Job>> getByActiveTrueAndEmployer_CompanyName(String companyName) {
        return new SuccessDataResult<List<Job>>(this.jobDao.getByActiveTrueAndEmployer_CompanyName(companyName));
	}

	@Override
	public DataResult<List<Job>> getByActiveTrueOrderByCreatedTimeDesc() {
		return new SuccessDataResult<List<Job>>(this.jobDao.getByActiveTrueOrderByCreatedTimeDesc());
	}

	@Override
	public DataResult<Job> getByIdAndActiveTrue(int id) {
		return new SuccessDataResult<Job>(this.jobDao.getByIdAndActiveTrue(id));
	}

	@Override
	public Result update(Job job) {
		this.jobDao.save(job);
		return new SuccessResult("meslekler güncellendi");
	}

	@Override
	public Result delete(int jobId) {
		this.jobDao.deleteById( jobId);
		return new SuccessResult("meslek silindi");
	}



}
