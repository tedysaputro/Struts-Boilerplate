package com.embeddednesia.struts.service;

import com.embeddednesia.struts.model.User;

public interface UserService {
	User findById(int userId);
	User findByUserName(String userName);
	User createNewUser(String name, String userName, String password);

}
