package bediryaz.l.m.hrms.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import bediryaz.l.m.hrms.business.abstracts.TechnologyService;
import bediryaz.l.m.hrms.core.utilities.results.DataResult;
import bediryaz.l.m.hrms.core.utilities.results.Result;
import bediryaz.l.m.hrms.core.utilities.results.SuccessDataResult;
import bediryaz.l.m.hrms.core.utilities.results.SuccessResult;
import bediryaz.l.m.hrms.dataAccess.abstracts.TechnologyDao;
import bediryaz.l.m.hrms.entities.concretes.Technology;

@Service
public class TechnologyManager implements TechnologyService{

	private TechnologyDao technologyDao;
	
	@Autowired
	public TechnologyManager(TechnologyDao technologyDao) {
		super();
		this.technologyDao = technologyDao;
	}

	@Override
	public Result add(Technology technology) {
		this.technologyDao.save(technology);
		return new SuccessResult("Technology added");
	}

	@Override
	public Result delete(int technologyId) {
		this.technologyDao.deleteById(technologyId);
		return new SuccessResult("Technology deleted");
	}

	@Override
	public DataResult<List<Technology>> getAll() {
		return new SuccessDataResult<List<Technology>>(this.technologyDao.findAll(),"Technology Listed");
	}

}
