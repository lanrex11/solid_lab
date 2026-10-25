package ocp;

public class AppleAuth implements IAuth {

	@Override
	public boolean singIn(String log, String pass) {
		//use the Apple api
		return true;
	}

}
