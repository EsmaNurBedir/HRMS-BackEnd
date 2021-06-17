package bediryaz.l.m.hrms.core.activation;

public interface ActivationService {

	void sendlink(String email );
	
	String sendcode();
}
