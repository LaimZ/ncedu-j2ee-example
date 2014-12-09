package ru.ncedu.beans.common;

import java.util.List;

import javax.ejb.Local;

@Local
public interface SessionLocal {
	String getUsername();
	List<User> getUsers();
	void login(String login, String pass);
}
