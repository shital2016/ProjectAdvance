package com.jbk.dao;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.Restrictions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.jbk.entity.Employee;

@Repository
public class SpringMVCDao {

	@Autowired
	SessionFactory sessionFactory;
	
	public boolean checkLoginPage(Employee user) {

		System.out.println("In Dao"+user.getUsername());
		System.out.println("In Dao"+user.getPassword());
		String username = user.getUsername();
		String password = user.getPassword();
		Session session = sessionFactory.openSession();
		Criteria criteria = session.createCriteria(Employee.class);
		criteria.add(Restrictions.eq("username", username));
		criteria.add(Restrictions.eq("password", password));
		List<Employee> listUser = criteria.list();
		if(!listUser.isEmpty()) {
			return true;
		}else {
		
		return false;
	}
	}

	public List<Employee> getUser() {

		Session session = sessionFactory.openSession();
		Criteria criteria = session.createCriteria(Employee.class);
		List<Employee> listUser = criteria.list();
		System.out.println(listUser);
		return listUser;
	}

}
