package com.home.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.EnableTransactionManagement;
import org.springframework.transaction.annotation.Transactional;

import com.home.model.Donor;



@Repository
@Transactional
@EnableTransactionManagement
public class DonorDAOimpl implements DonorDAO{

	@Autowired
	SessionFactory sessionFactory;
	

	public void addDonor(Donor D) {
		// TODO Auto-generated method stub
		sessionFactory.getCurrentSession().save(D);
		
	}

	public void updateDonor(Donor D) {
		// TODO Auto-generated method stub
		sessionFactory.getCurrentSession().update(D);
	}

	public List<Donor> listDonor() {
		// TODO Auto-generated method stub
		List<Donor> list = sessionFactory.getCurrentSession().createQuery("from Donor D").list();
		return list;
	}

	public Donor getDonorById(int id) {
		// TODO Auto-generated method stub
List<Donor> list = sessionFactory.getCurrentSession().createQuery("from Donor D where D.id = :id").setInteger("id", id).list();
		
		if( !list.isEmpty() )
			return list.get(0);
		else
		return null;
	}

	public void removeDonor(int id) {
		// TODO Auto-generated method stub
		sessionFactory.getCurrentSession().createQuery("delete from  Donor D where D.id = :id").setInteger("id", id).executeUpdate();
		
	}


}

	
