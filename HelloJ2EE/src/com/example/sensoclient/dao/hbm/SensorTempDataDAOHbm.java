package com.example.sensoclient.dao.hbm;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.*;
import org.springframework.transaction.annotation.Transactional;
import org.hibernate.Query;
import org.hibernate.Session; 
import org.hibernate.SessionFactory; 
import org.hibernate.Transaction;

import com.example.sensoclient.dao.SensorTempDataDAO;
import com.example.sensoclient.model.SensorTempData;

public class SensorTempDataDAOHbm implements SensorTempDataDAO {

	
    private SessionFactory sessionFactory; 
    
    public SessionFactory getSessionFactory() { 
    return sessionFactory; 
    } 
 
    public void setSessionFactory(SessionFactory sessionFactory) { 
    this.sessionFactory = sessionFactory; 
    } 
	
	@Override
	@Transactional
	public List<SensorTempData> getAllData() {

        List result = null;
        
        Query query = sessionFactory.getCurrentSession().createQuery("from SensorTempData");
        result = (List<SensorTempData>)query.list();
		return result;
	}

	@Override
	@Transactional
	public List<SensorTempData> getDataBySID(String sid) {
        List result = null;
        
        Query query = sessionFactory.getCurrentSession().createQuery("from SensorTempData as s where s.sid=?");
        query.setString(0, sid);
        
        
        result = (List<SensorTempData>)query.list();
		return result;
	}

	@Override
	@Transactional
	public void saveData(SensorTempData data) {
		// TODO Auto-generated method stub
		sessionFactory.getCurrentSession().save(data);
		
	}


}
