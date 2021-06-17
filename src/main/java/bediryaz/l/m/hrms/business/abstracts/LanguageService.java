package bediryaz.l.m.hrms.business.abstracts;

import java.util.List;

import bediryaz.l.m.hrms.core.utilities.results.DataResult;
import bediryaz.l.m.hrms.entities.concretes.Language;

public interface LanguageService {

	DataResult<Language> getById(int id);
	
	DataResult<List<Language>>  getAllByResume_id(int id);
	
	DataResult<List<Language>> getByLanguageName(String languageName);
}
