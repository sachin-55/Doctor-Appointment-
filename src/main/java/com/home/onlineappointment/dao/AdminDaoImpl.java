package com.home.onlineappointment.dao;

import javax.annotation.Resource;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.Restrictions;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.home.onlineappointment.model.Adminn;

@Repository
public class AdminDaoImpl implements AdminDao {

	@Resource
	private SessionFactory sessionFactory;
	
	@Override
	@Transactional
	public void signupAdmin(Adminn a) {
		Session session=sessionFactory.getCurrentSession();
		session.save(a);
		
	}

	@Override
	@Transactional
	public Adminn verifyAdmin(String un, String psw) {

		Session session=sessionFactory.getCurrentSession();
		Criteria crt = session.createCriteria(Adminn.class);
		
		crt.add(Restrictions.eq("username", un)).add(Restrictions.eq("password", psw));
		Adminn a  = (Adminn) crt.uniqueResult();
		
		
		return a;
	}

	@Override
	@Transactional
	public Adminn getInfo(int id) {
		Session session =sessionFactory.getCurrentSession();
		Adminn a = (Adminn) session.get(Adminn.class, id);
		
		return a;
	}

}
