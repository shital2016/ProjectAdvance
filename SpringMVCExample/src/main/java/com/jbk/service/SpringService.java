package com.jbk.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jbk.dao.SpringMVCDao;
import com.jbk.entity.Employee;

@Service
public class SpringService {

	@Autowired
	SpringMVCDao mvcdao;
	
	public boolean checkLoginPage(Employee user) {
		
		boolean result  = mvcdao.checkLoginPage(user);
		// TODO Auto-generated method stub
		return result;
	}

	public List<Employee> getUser() {

	List<Employee> listuser = 	mvcdao.getUser();
		
		return listuser;
	}

}
