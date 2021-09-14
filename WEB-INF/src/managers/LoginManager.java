package managers;

import domain.CustomerBean;

public class LoginManager {

	public LoginManager() {}
	
	public Boolean authenticate(CustomerBean login) {
		Boolean success = false;
		if((login.getUsername() != null && login.getUsername().length() > 0) && (login.getPassword() != null && login.getPassword().length() > 0)) {
			success = true;
		}
		return success;
	}

}
