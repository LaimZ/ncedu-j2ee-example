package ru.ncedu.beans.common;

import java.util.List;

public class UserActivityChanger extends Thread {

	private List<User> users;
	
	private int SecondsOffline = 20;
	
	public void setUserList(List<User> users) {
		this.users = users;
	}
	
	@Override
	public void run() {
		// TODO Auto-generated method stub
		while (true ) {
			if (users!=null) {
				for (User u : users) {
					u.secondsOffline++;
					if (u.secondsOffline > SecondsOffline) {
						users.remove(u);
					}
					u.name = u.name + ":)";
				}
			} else {
				//throw new Exception("List of users not set in UserActivityChanger!!!"); 
			}
		try {
			this.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		}
	}
	
}