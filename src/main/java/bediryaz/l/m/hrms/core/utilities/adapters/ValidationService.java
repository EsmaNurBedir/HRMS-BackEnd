package bediryaz.l.m.hrms.core.utilities.adapters;

public interface ValidationService {

	boolean validateByMernis(long nationalId, String firstName, String lastName, int yearOfBirth);
}
