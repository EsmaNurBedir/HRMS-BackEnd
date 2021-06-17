package bediryaz.l.m.hrms.business.abstracts;

import java.util.List;

import bediryaz.l.m.hrms.core.utilities.results.DataResult;
import bediryaz.l.m.hrms.core.utilities.results.Result;
import bediryaz.l.m.hrms.entities.concretes.Image;

public interface ImageService {
	
	Result add(Image image);
	
	Result update(Image image);
	
	Result delete(int imageId);

   DataResult<List<Image>> getAll();

}
