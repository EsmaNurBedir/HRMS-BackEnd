package bediryaz.l.m.hrms.dataAccess.abstracts;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import bediryaz.l.m.hrms.entities.concretes.Language;

public interface LanguageDao extends JpaRepository<Language,Integer>{

	Language getById(int id);
	
	List<Language>  getAllByResume_id(int id);
	
	List<Language> getByLanguageName(String languageName);
}
