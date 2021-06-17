package bediryaz.l.m.hrms.business.concretes;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import bediryaz.l.m.hrms.business.abstracts.UserService;
import bediryaz.l.m.hrms.core.dataAccess.UserDao;
import bediryaz.l.m.hrms.core.entities.User;
import bediryaz.l.m.hrms.core.utilities.results.DataResult;
import bediryaz.l.m.hrms.core.utilities.results.Result;
import bediryaz.l.m.hrms.core.utilities.results.SuccessDataResult;
import bediryaz.l.m.hrms.core.utilities.results.SuccessResult;

@Service
public class UserManager implements UserService{

	private UserDao userDao;
	
	@Autowired
	public UserManager(UserDao userDao) {
		super();
		this.userDao = userDao;
	}

	@Override
	public Result add(User user) {
         this.userDao.save(user);
         return new SuccessResult("Kişi eklendi");
	}

	@Override
	public DataResult<User> getByEmail(String email) {
	       return new SuccessDataResult<User>(this.userDao.getByEmail(email),"Kullanıcı bulundu");
	}

}
