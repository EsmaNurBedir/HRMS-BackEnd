package bediryaz.l.m.hrms.core.dataAccess;

import org.springframework.data.jpa.repository.JpaRepository;

import bediryaz.l.m.hrms.core.entities.User;

public interface UserDao extends JpaRepository<User,Integer>{

	User  getByEmail(String email);
}
