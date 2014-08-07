package com.service.hqhub.dao.hbm;
import org.springframework.stereotype.*;
import org.springframework.transaction.annotation.Transactional;
import org.hibernate.Query;
import org.hibernate.Session; 
import org.hibernate.SessionFactory; 
import org.hibernate.Transaction;
public class BaseDAOHbm {
	
    protected SessionFactory sessionFactory; 
    
    public SessionFactory getSessionFactory() { 
    return sessionFactory; 
    } 
 
    public void setSessionFactory(SessionFactory sessionFactory) { 
    this.sessionFactory = sessionFactory; 
    } 

}
