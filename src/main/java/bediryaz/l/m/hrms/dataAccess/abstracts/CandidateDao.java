package bediryaz.l.m.hrms.dataAccess.abstracts;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import bediryaz.l.m.hrms.entities.concretes.Candidate;

public interface CandidateDao extends JpaRepository<Candidate,Integer>{

	List<Candidate> getByIdentityNumber(String identityNumber);
	
	List<Candidate> getByEmail(String email);
	
}
