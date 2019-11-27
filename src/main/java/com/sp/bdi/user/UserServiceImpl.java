package com.sp.bdi.user;

import java.util.List;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Service;

@Service("us")
public class UserServiceImpl implements UserService {

	@Autowired
	private UserDAO udao;
	@Override
	public List<Map<String, String>> getUserList() {
		return udao.SelectUserList();
	}

}
