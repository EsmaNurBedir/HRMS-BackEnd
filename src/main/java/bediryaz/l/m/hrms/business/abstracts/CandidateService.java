package bediryaz.l.m.hrms.business.abstracts;

import java.util.List;

import bediryaz.l.m.hrms.core.utilities.results.DataResult;
import bediryaz.l.m.hrms.core.utilities.results.Result;
import bediryaz.l.m.hrms.entities.concretes.Candidate;


public interface CandidateService {
 
	Result add(Candidate candidate);
	
	DataResult<List<Candidate>> getByIdentityNumber(String identityNumber);
	
	DataResult<List<Candidate>> getByEmail(String email);

}
