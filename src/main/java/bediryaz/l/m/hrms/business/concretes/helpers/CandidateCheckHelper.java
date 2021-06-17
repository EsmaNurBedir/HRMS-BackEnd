package bediryaz.l.m.hrms.business.concretes.helpers;

import bediryaz.l.m.hrms.entities.concretes.Candidate;

public class CandidateCheckHelper {

	public static boolean allFieldsAreRequried(Candidate candidate) {
		if(candidate.getEmail().strip().isEmpty()
				|| candidate.getPassword().strip().isEmpty()
				|| candidate.getFisrtName().strip().isEmpty()
				|| candidate.getLastName().strip().isEmpty()
				|| candidate.getIdentityNumber().strip().isEmpty()
				|| candidate.getBirthDate().toString().strip().isEmpty()

				) {
			return false;
			
		}
		return true;
	}
}
