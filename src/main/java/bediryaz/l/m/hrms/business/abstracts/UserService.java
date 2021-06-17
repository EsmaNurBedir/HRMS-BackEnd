package bediryaz.l.m.hrms.business.abstracts;

import bediryaz.l.m.hrms.core.entities.User;
import bediryaz.l.m.hrms.core.utilities.results.DataResult;
import bediryaz.l.m.hrms.core.utilities.results.Result;

public interface UserService {

	Result add(User user);
	
	DataResult<User> getByEmail(String email);
	
}
