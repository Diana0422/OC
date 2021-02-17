package logic;

public class LoadUserProfile {

	private UserProfile login(String email) {
		UserProfile user = null;
		if (email.equals("diana@gmail.com")) {
			user = new UserProfile();
			user.setName("Diana");
		}
		return user;
	}
	
	public String loadProfile(String email) {
		UserProfile u = login(email);
		return u.getName();
	}
}
