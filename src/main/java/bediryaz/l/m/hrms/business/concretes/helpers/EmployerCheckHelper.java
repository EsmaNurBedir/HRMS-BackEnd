package bediryaz.l.m.hrms.business.concretes.helpers;

import bediryaz.l.m.hrms.entities.concretes.Employer;

public class EmployerCheckHelper {

	public static boolean allFieldsAreRequried(Employer employer) {
		if(employer.getEmail().strip().isEmpty()
				|| employer.getPassword().strip().isEmpty()
				|| employer.getCompanyName().strip().isEmpty()
				|| employer.getWebAddress().strip().isEmpty()) {
			return false;
		}
		return true;
	} 
}
