package com.lti.gisdemo.service;

import java.util.List;

import com.lti.gisdemo.entity.User;

public interface GISService {
	public User getUser(long userId);
	public User registerUser(User user);
	public void deleteUser(long userId);
	public List<User> getAllUsers();
}
