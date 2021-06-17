package bediryaz.l.m.hrms.dataAccess.abstracts;


import org.springframework.data.jpa.repository.JpaRepository;

import bediryaz.l.m.hrms.entities.concretes.Education;



public interface EducationDao extends JpaRepository<Education,Integer>{
	
 
}
