
public class AgeUserCheckService implements IUserCheckService {

	public boolean checkUser(User user) {
		if (user.getAge() >= 18) {
			return true;
		} else {
			return false;
		}
	}

	// Method olacak

}

