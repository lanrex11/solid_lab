package ocp;

public class AuthService {
	public boolean signIn(IAuth service, String log, String pass) {
		return(service.singIn(log, pass));

	}

}
