package bediryaz.l.m.hrms.dataAccess.abstracts;


import org.springframework.data.jpa.repository.JpaRepository;

import bediryaz.l.m.hrms.entities.concretes.Image;

public interface ImageDao extends JpaRepository<Image,Integer>{
	

}
