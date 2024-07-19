package com.pradeep.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.pradeep.dao.UserDAO;
import com.pradeep.model.User;

@Service
public class UserServiceImpl implements UserService {
	
	@Autowired
	private UserDAO userDAO;

	
	@Override
	@Transactional
	public void save(User user) {
		userDAO.save(user);
	}

}
