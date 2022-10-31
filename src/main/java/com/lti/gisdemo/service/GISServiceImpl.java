package com.lti.gisdemo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lti.gisdemo.entity.User;
import com.lti.gisdemo.repository.GISRepository;

@Service
public class GISServiceImpl implements GISService{

	@Autowired
	private GISRepository gisRepository;
	@Override
	public User getUser(long userId) {
		return gisRepository.findById(userId).get();
	}

	@Override
	public User registerUser(User user) {
		return gisRepository.save(user);
	}

	@Override
	public List<User> getAllUsers() {
		return gisRepository.findAll();
	}

	@Override
	public void deleteUser(long userId) {
		// TODO Auto-generated method stub
		
	}

}
