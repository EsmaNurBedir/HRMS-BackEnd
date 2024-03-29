package bediryaz.l.m.hrms.dataAccess.abstracts;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import bediryaz.l.m.hrms.entities.concretes.Employer;

public interface EmployerDao extends JpaRepository<Employer,Integer>{

           List<Employer> getByEmail(String email);
      
}
