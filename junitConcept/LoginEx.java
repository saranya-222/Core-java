package junitConcept;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class LoginEx {
	String username,password;

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
	public boolean login() {
		if(getUsername().equals("admin")&&getPassword().equals("admin123"))
		{
			return true;
		}
		else
		{
			return false;
		}
	}


	
	

}
