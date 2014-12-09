package ru.ncedu.beans.managed;

import java.io.Serializable;
import java.util.List;

import javax.ejb.EJB;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

import ru.ncedu.beans.common.SessionLocal;
import ru.ncedu.beans.common.User;

@ManagedBean
public class HelloBean implements Serializable{
	
	@EJB
	private SessionLocal session;

	private String login;
	private String pass;
	
	public List<User> getUsers() {
		return session.getUsers();
	}
	
	public String getLogin() {
		return login;
	}
	public void setLogin(String login) {
		this.login = login;
	}
	public String getPass() {
		return pass;
	}
	public void setPass(String pass) {
		this.pass = pass;
	}
	
	public String letMeIn(){
		session.login(login, pass);
		return "welcome";
	}
	
	public String getCurrentUser(){
		return session.getUsername();
	}


}
