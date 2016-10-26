package com.home.dao;
import java.util.List;


import org.hibernate.SessionFactory;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.EnableTransactionManagement;
import org.springframework.transaction.annotation.Transactional;

import com.home.dao.RequirementDAO;
import com.home.model.Requirement;

@Repository
@Transactional
@EnableTransactionManagement

public class RequirementDAOimpl implements RequirementDAO{

	@Autowired
	SessionFactory sessionFactory;
	
	public void addRequirement(Requirement r) {
		// TODO Auto-generated method stub
		sessionFactory.getCurrentSession().save(r);
		
	}

	public void updateRequirement(Requirement r) {
		// TODO Auto-generated method stub
		sessionFactory.getCurrentSession().update(r);
	}

	public List<Requirement> listRequirement() {
		// TODO Auto-generated method stub
List<Requirement> list = sessionFactory.getCurrentSession().createQuery("from Requirement r").list();
		
		return list;
	}

	public Requirement getRequirementById(int id) {
		// TODO Auto-generated method stub
List<Requirement> list = sessionFactory.getCurrentSession().createQuery("from Requirement r where r.id = :id").setInteger("id", id).list();
		
		if( !list.isEmpty() )
			return list.get(0);
		else
			return null;
		
	}

	public void removeRequirement(int id) {
		// TODO Auto-generated method stub
		sessionFactory.getCurrentSession().createQuery("delete from  Requirement r where r.id = :id").setInteger("id", id).executeUpdate();
		
	}




	
}
