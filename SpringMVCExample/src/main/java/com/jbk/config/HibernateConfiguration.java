package com.jbk.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.orm.hibernate5.LocalSessionFactoryBean;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

import com.jbk.entity.Employee;

@Configuration
@EnableWebMvc
public class HibernateConfiguration {


	@Autowired
	ApplicationContext context;
	
	@Bean
	public LocalSessionFactoryBean getBeab(){
		
		System.out.println("I am in Hibernate Configuration Class....");
		
		LocalSessionFactoryBean factoryBean = new LocalSessionFactoryBean();
		factoryBean.setConfigLocation(context.getResource("classpath:hibernate.cfg.xml"));
		factoryBean.setAnnotatedClasses(Employee.class);
		return factoryBean;
	}
}
