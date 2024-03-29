package bediryaz.l.m.hrms.core.utilities;

import java.io.File;
import java.io.IOException;
import java.util.Map;

import org.springframework.web.multipart.MultipartFile;

public interface CloudinaryService {

	public Map<?,?> photoUploud(MultipartFile multipartFile) throws IOException;
	
	public  Map<?,?> photoDelete(String id) throws IOException;
	
	public File convert(MultipartFile multipartFile) throws  IOException;
}
