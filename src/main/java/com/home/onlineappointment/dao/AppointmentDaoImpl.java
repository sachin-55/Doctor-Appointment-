package com.home.onlineappointment.dao;

import java.util.List;

import javax.annotation.Resource;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.Restrictions;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.home.onlineappointment.model.Appointmentt;

@Repository
public class AppointmentDaoImpl implements AppointmentDao {

	@Resource
	private SessionFactory sessionFactory;
	
	@Override
	@Transactional
	public void registerAppointment(Appointmentt p) {
		Session session =sessionFactory.getCurrentSession();
		session.save(p);
	}

	@Override
	@Transactional
	public List<Appointmentt> findDoctor(int id) {
		Session session= sessionFactory.getCurrentSession();
		Criteria crt= session.createCriteria(Appointmentt.class);
		
		crt.add(Restrictions.eq("apto", id));
		List<Appointmentt> app = crt.list();
		
		return app;
	}

	@Override
	@Transactional
	public Appointmentt getInfo(int id) {
			Session session = sessionFactory.getCurrentSession();
			Appointmentt ap = (Appointmentt) session.get(Appointmentt.class, id);
		
		return ap;
	}

	@Override
	@Transactional
	public void updateStatus(Appointmentt a) {
			Session session = sessionFactory.getCurrentSession();
			Appointmentt appo = (Appointmentt) session.get(Appointmentt.class, a.getAppid());

			appo.setHospital(a.getHospital());
			appo.setPatientstatus(1);
			
			if(appo.getGrantdate()==null){
				appo.setGrantdate(appo.getReqdate());
			}
			
			session.update(appo);
		
	}

	@Override
	@Transactional
	public void updateDate(Appointmentt a) {
		Session session = sessionFactory.getCurrentSession();
		Appointmentt appo = (Appointmentt) session.get(Appointmentt.class, a.getAppid());
		
		appo.setApptime(a.getApptime());
		appo.setGrantdate(a.getGrantdate());
	
		session.update(appo);

	}

}
