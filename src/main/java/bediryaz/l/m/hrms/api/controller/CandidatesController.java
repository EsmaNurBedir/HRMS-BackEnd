package bediryaz.l.m.hrms.api.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import bediryaz.l.m.hrms.business.abstracts.CandidateService;
import bediryaz.l.m.hrms.core.utilities.results.DataResult;
import bediryaz.l.m.hrms.core.utilities.results.Result;
import bediryaz.l.m.hrms.entities.concretes.Candidate;

@RestController
@RequestMapping(value="/api/candidates")
public class CandidatesController {

	private CandidateService candidateService;

	@Autowired
	public CandidatesController(CandidateService candidateService) {
		super();
		this.candidateService = candidateService;
	}
	
	@PostMapping("/add")
	public Result add(Candidate candidate) {
		return this.candidateService.add(candidate);
	}
	
	@GetMapping("/getByIdentityNumber")
	public DataResult<List<Candidate>> getByIdentityNumber(String identityNumber){
		return this.candidateService.getByIdentityNumber(identityNumber);
	}
	
	@GetMapping("/getbyemail")
	DataResult<List<Candidate>> getByEmail(String email){
		return this.candidateService.getByEmail(email);
		
	}
	
	
	
	
	
	
	
	
	
}
