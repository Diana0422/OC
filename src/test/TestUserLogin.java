package test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import logic.LoadUserProfile;

class TestLoadUserProfile {

	@Test
	void testLoadProfile() {
		LoadUserProfile lup = new LoadUserProfile();
		String res = lup.loadProfile("diana@gmail.com");
		assertEquals("Diana", res);
	}
	
//	@Test
//	void testLoadProfileBug() {
//		LoadUserProfile lup = new LoadUserProfile();
//		String res = lup.loadProfile("diana@students.uniroma2.eu");
//		assertEquals("Diana", res);
//	}

}
