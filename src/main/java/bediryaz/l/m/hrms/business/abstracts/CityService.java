package bediryaz.l.m.hrms.business.abstracts;

import java.util.List;

import bediryaz.l.m.hrms.core.utilities.results.DataResult;
import bediryaz.l.m.hrms.core.utilities.results.Result;
import bediryaz.l.m.hrms.entities.concretes.City;

public interface CityService {

	DataResult<List<City>> getById(int id);
	
	DataResult<List<City>> getByCityName(String cityName);
	
	Result add(City city);
	
}
