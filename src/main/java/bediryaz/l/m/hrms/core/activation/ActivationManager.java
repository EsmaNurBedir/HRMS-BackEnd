package bediryaz.l.m.hrms.core.activation;

import java.util.UUID;

import org.springframework.stereotype.Service;

@Service
public class ActivationManager implements ActivationService {

	@Override
	public void sendlink(String email) {
		UUID uuid = UUID.randomUUID();
		String activationLink = "htttp://hrmsverificationmail/" + uuid.toString();
		System.out.println("verification link has been sent to"+ email );
		System.out.println("Please click on the link to verify your  account: " + activationLink);
		
		
	}

	@Override
	public String sendcode() {
		
		UUID uuid = UUID.randomUUID();
		String activationCode = uuid.toString();
		System.out.println("Your activation code: " + activationCode);
		return activationCode;
	}

}
