package org.pulem3t.tasks.dao;

import java.util.List;

import org.pulem3t.tasks.entries.User;

public interface UserDAO {

	public List<User> getUsers();
	public User getUser(String id);
	public boolean addUser(User user);
	public boolean deleteUser(String id);
	public boolean updateUser(User user);
	public boolean setUserRole(String id, int role);
}
