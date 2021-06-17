package bediryaz.l.m.hrms.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import bediryaz.l.m.hrms.business.abstracts.EducationService;
import bediryaz.l.m.hrms.core.utilities.results.DataResult;
import bediryaz.l.m.hrms.core.utilities.results.Result;
import bediryaz.l.m.hrms.core.utilities.results.SuccessDataResult;
import bediryaz.l.m.hrms.core.utilities.results.SuccessResult;
import bediryaz.l.m.hrms.dataAccess.abstracts.EducationDao;
import bediryaz.l.m.hrms.entities.concretes.Education;
@Service
public class EducationManager implements EducationService {
	private EducationDao educationDao;
	
	
	@Autowired
	public EducationManager(EducationDao educationDao) {
		super();
		this.educationDao = educationDao;
	}


	@Override
	public Result add(Education education) {
		this.educationDao.save(education);
		return new SuccessResult("Education added");
	}

	@Override
	public Result delete(int educationId) {
		this.educationDao.deleteById(educationId);
		return new SuccessResult("Education deleted");
	}

	@Override
	public DataResult<List<Education>> getAll() {
		return new SuccessDataResult<List<Education>>(this.educationDao.findAll(),"Education listed");
	}
	
	
	
	
	
	
	
}
