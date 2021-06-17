package bediryaz.l.m.hrms.business.concretes;



import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import bediryaz.l.m.hrms.business.abstracts.CandidateService;
import bediryaz.l.m.hrms.core.utilities.results.DataResult;
import bediryaz.l.m.hrms.core.utilities.results.Result;
import bediryaz.l.m.hrms.core.utilities.results.SuccessDataResult;
import bediryaz.l.m.hrms.core.utilities.results.SuccessResult;
import bediryaz.l.m.hrms.dataAccess.abstracts.CandidateDao;
import bediryaz.l.m.hrms.entities.concretes.Candidate;

@Service
public class CandidateManager implements CandidateService{

	private CandidateDao candidateDao;
	
	@Autowired
	public CandidateManager(CandidateDao candidateDao) {
		super();
		this.candidateDao = candidateDao;
	}
	@Override
	public Result add(Candidate candidate) {
		this.candidateDao.save(candidate);
		return new SuccessResult();
	}
	@Override
	public DataResult<List<Candidate>> getByIdentityNumber(String identityNumber) {
		return new SuccessDataResult<List<Candidate>>(this.candidateDao.getByIdentityNumber(identityNumber));
	}
	@Override
	public DataResult<List<Candidate>> getByEmail(String email) {
		return new SuccessDataResult<List<Candidate>>(this.candidateDao.getByEmail(email));
	}





}
