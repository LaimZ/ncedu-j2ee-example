package ru.ncedu.beans.common;

import javax.ejb.*;

@Stateless
public class User {
	
	public String name;
	
	public int secondsOffline = 0;

	public User() {
		
	}
	
	public User(String name) {
		super();
		this.name = name;
	}
	
	public int getSecondsOnline() {
		return secondsOffline;
	}

	public void setSecondsOnline(int secondsOnline) {
		this.secondsOffline = secondsOnline;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
}
