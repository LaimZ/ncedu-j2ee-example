package ru.ncedu.beans.common;

import javax.ejb.Local;

@Local
public interface SessionLocal {
	String getUsername();
	void login(String login, String pass);
}
