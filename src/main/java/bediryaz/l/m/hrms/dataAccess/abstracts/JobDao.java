package bediryaz.l.m.hrms.dataAccess.abstracts;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import bediryaz.l.m.hrms.entities.concretes.Job;

public interface JobDao extends JpaRepository<Job,Integer>{

	List<Job> getByActiveTrue();
	
	List<Job> getByActiveTrueAndEmployer_CompanyName(String companyName);
	
	List<Job> getByActiveTrueOrderByCreatedTimeDesc();
	
	Job getByIdAndActiveTrue(int id);
}
