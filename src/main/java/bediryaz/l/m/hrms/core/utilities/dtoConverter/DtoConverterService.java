package bediryaz.l.m.hrms.core.utilities.dtoConverter;

import java.util.List;

public interface DtoConverterService {

	public <T> Object dtoClassConvert(Object source,Class<T> baseClass);
	public <S, T> List<T> dtoConverter(List<S> s, Class<T> targetClass) ;
}
