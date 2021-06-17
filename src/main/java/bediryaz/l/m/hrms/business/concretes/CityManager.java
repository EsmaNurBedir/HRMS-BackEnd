package bediryaz.l.m.hrms.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import bediryaz.l.m.hrms.business.abstracts.CityService;
import bediryaz.l.m.hrms.core.utilities.results.DataResult;
import bediryaz.l.m.hrms.core.utilities.results.Result;
import bediryaz.l.m.hrms.core.utilities.results.SuccessDataResult;
import bediryaz.l.m.hrms.core.utilities.results.SuccessResult;
import bediryaz.l.m.hrms.dataAccess.abstracts.CityDao;
import bediryaz.l.m.hrms.entities.concretes.City;

@Service
public class CityManager implements CityService{

	private CityDao cityDao;
	
	@Autowired
	public CityManager(CityDao cityDao) {
	
		this.cityDao = cityDao;
	}

	@Override
	public DataResult<List<City>> getById(int id) {
		return new SuccessDataResult<List<City>>(this.cityDao.getById(id));
	}

	@Override
	public DataResult<List<City>> getByCityName(String cityName) {
		return new SuccessDataResult<List<City>>(this.cityDao.getByCityName(cityName),"sehirler listelendi");
	}

	@Override
	public Result add(City city) {
		this.cityDao.save(city);
		return new SuccessResult("sehir eklendi");
	}








	
}
