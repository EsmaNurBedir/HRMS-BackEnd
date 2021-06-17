package bediryaz.l.m.hrms.dataAccess.abstracts;

import org.springframework.data.jpa.repository.JpaRepository;

import bediryaz.l.m.hrms.entities.concretes.Technology;

public interface TechnologyDao extends JpaRepository<Technology,Integer>{

	
}
