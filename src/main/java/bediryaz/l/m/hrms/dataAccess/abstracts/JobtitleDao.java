package bediryaz.l.m.hrms.dataAccess.abstracts;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import bediryaz.l.m.hrms.entities.concretes.Jobtitle;

public interface JobtitleDao  extends JpaRepository<Jobtitle,Integer>{

	List<Jobtitle> getByTitle(String title);
}
