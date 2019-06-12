package com.home.onlineappointment.dao;

import java.util.List;

import javax.annotation.Resource;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.Restrictions;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.home.onlineappointment.model.Patientt;

@Repository
public class PatientDaoImpl implements PatientDao{

	@Resource
	private SessionFactory sessionFactory;
	
	@Override
	@Transactional
	public void signupPatient(Patientt p) {
		
		Session session=sessionFactory.getCurrentSession();
		session.save(p);
		
	}

	@Override
	@Transactional
	public Patientt verifyPatient(String un, String psw) {
		Session session=sessionFactory.getCurrentSession();
		Criteria crt = session.createCriteria(Patientt.class);
		
		crt.add(Restrictions.eq("usernamep", un)).add(Restrictions.eq("passwordp", psw));
		Patientt p  = (Patientt) crt.uniqueResult();
		
		return p;
		
	}

	@Override
	@Transactional
	public List<Patientt> getAll() {
		Session session = sessionFactory.getCurrentSession();
		Criteria crt = session.createCriteria(Patientt.class);
		
		return crt.list();
	}

	@Override
	@Transactional
	public Patientt getInfo(int id) {
		Session session =sessionFactory.getCurrentSession();
		Patientt pat = (Patientt) session.get(Patientt.class, id);
		
		return pat;
	}

}
