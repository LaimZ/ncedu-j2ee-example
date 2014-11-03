package ru.ncedu.beans.common;

import javax.ejb.*;

@Stateful
public class SessionBean implements SessionLocal{

	String username;
	
	@Override
	public String getUsername(){
		return username;
	}
	
	private void setUsername(String name){
		username = name;
	}

	@Override
	public void login(String login, String pass) {
		setUsername(login);
	}
	
}
