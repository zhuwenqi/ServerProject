package com.service.hqhub.dao.hbm;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import oracle.sql.DATE;

import org.springframework.stereotype.*;
import org.springframework.transaction.annotation.Transactional;
import org.hibernate.Query;
import org.hibernate.Session; 
import org.hibernate.SessionFactory; 
import org.hibernate.Transaction;

import com.service.hqhub.dao.F1DynFlightDAO;
import com.service.hqhub.model.F1DynFlight;
import com.service.hqhub.util.CommonTool;

public class F1DynFlightDAOHbm extends BaseDAOHbm implements F1DynFlightDAO{

	@Override
	@Transactional
	public List<F1DynFlight> getAllData() {
        List result = null;
        
        Query query = sessionFactory.getCurrentSession().createQuery("from F1DynFlight order by operation_date desc");
        query.setFirstResult(1);
        query.setMaxResults(10);
        result = (List<F1DynFlight>)query.list();
		return result;
	}

	@Override
	@Transactional
	public List<F1DynFlight> getFlightById(String fid, String fdate) {
		// TODO Auto-generated method stub
		List result = null;
		System.out.println(fdate);
		Query query = sessionFactory.getCurrentSession().createQuery("from F1DynFlight where operation_date=? and flight_no=? order by operation_date desc");

		Date date;
		try {
			date = CommonTool.strToDate(fdate);
			query.setDate(0, date);
	        query.setString(1, fid);
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
        
        result = (List<F1DynFlight>)query.list();
		return result;
	}

}
