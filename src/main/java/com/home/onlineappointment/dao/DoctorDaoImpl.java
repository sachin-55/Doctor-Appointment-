package com.home.onlineappointment.dao;

import java.util.List;

import javax.annotation.Resource;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.Restrictions;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.home.onlineappointment.model.Doctorr;

@Repository
public class DoctorDaoImpl implements DoctorDao {
	
	@Resource
	private SessionFactory sessionFactory;

	@Override
	@Transactional
	public void signupDoctor(Doctorr d) {
		Session session = sessionFactory.getCurrentSession();
		session.save(d);
		
	}

	@Override
	@Transactional
	public Doctorr verifyDoctor(String un, String psw) {
		Session session= sessionFactory.getCurrentSession();
		Criteria crt=session.createCriteria(Doctorr.class);
		crt.add(Restrictions.eq("usernamed", un)).add(Restrictions.eq("passwordd", psw));		
		Doctorr d = (Doctorr) crt.uniqueResult();
		
		
		return d;
	}

	@Override
	@Transactional
	public List<Doctorr> getAll() {
		Session session = sessionFactory.getCurrentSession();
		Criteria crt = session.createCriteria(Doctorr.class);
		return crt.list();
	}

	@Override
	@Transactional
	public void updateStatus(Doctorr d) {
		Session session= sessionFactory.getCurrentSession();
		Doctorr dr = (Doctorr) session.get(Doctorr.class, d.getDid());
		dr.setStatus(d.getStatus());
		session.update(dr);
		
		
	}

	@Override
	@Transactional
	public Doctorr getinfo(int id) {
		Session session=sessionFactory.getCurrentSession();
		Doctorr doc=(Doctorr) session.get(Doctorr.class, id);
		
		
		return doc;
	}
	

}
