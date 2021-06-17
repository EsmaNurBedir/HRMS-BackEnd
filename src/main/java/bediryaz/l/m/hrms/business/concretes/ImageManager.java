package bediryaz.l.m.hrms.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import bediryaz.l.m.hrms.business.abstracts.ImageService;
import bediryaz.l.m.hrms.core.utilities.results.DataResult;
import bediryaz.l.m.hrms.core.utilities.results.Result;
import bediryaz.l.m.hrms.core.utilities.results.SuccessDataResult;
import bediryaz.l.m.hrms.core.utilities.results.SuccessResult;
import bediryaz.l.m.hrms.dataAccess.abstracts.ImageDao;
import bediryaz.l.m.hrms.entities.concretes.Image;

@Service
public class ImageManager implements ImageService{

	private ImageDao imageDao;
	
	@Autowired
	public ImageManager(ImageDao imageDao) {
		super();
		this.imageDao = imageDao;
	}

	@Override
	public Result add(Image image) {
		this.imageDao.save(image);
		return new SuccessResult("Image added");
	}

	@Override
	public Result update(Image image) {
		this.imageDao.save(image);
		return new SuccessResult("Image Updated");
	}

	@Override
	public Result delete(int id) {
		this.imageDao.deleteById(id);
		return new SuccessResult("Image deleted");
	}

	@Override
	public DataResult<List<Image>> getAll() {
		return new SuccessDataResult<List<Image>>(this.imageDao.findAll(),"Resimler listelendi");
	}



}
