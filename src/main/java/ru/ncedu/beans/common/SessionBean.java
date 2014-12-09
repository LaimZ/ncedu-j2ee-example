package ru.ncedu.beans.common;

import java.util.LinkedList;
import java.util.List;

import javax.ejb.*;

@Stateful
public class SessionBean implements SessionLocal{

	String username;
	public List<User> users = null;
	private UserActivityChanger userActivityChanger;
	{
		users = new LinkedList<User>();
		users.add(new User("First User"));
		users.add(new User("Second User"));
		//userActivityChanger.setUserList(users);
		//userActivityChanger.start();
		
	}
	
	public List<User> getUsers() {
		return users;
	}

	public void setUsers(List<User> users) {
		this.users = users;
	}

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
		users.add(new User(login));
	}
	
}
