package com.home.service;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;



import com.home.dao.DonorDAO;
import com.home.model.Donor;

@Service
public class Donorserviceimpl implements Donorservice{

	@Autowired
	DonorDAO udao;
	
	public void addperson(Donor D) {
		// TODO Auto-generated method stub
		udao.addDonor(D);
	}

	public void updatePerson(Donor D) {
		// TODO Auto-generated method stub
		udao.updateDonor(D);
	}

	public List<Donor> listDonor() {
		// TODO Auto-generated method stub
		return udao.listDonor();
	}

	public Donor getDonorById(int id) {
		// TODO Auto-generated method stub
		return udao.getDonorById(id);
	}

	public void removeDonor(int id) {
		// TODO Auto-generated method stub
		udao.removeDonor(id);
	}

	public void addDonor(Donor d) {
		// TODO Auto-generated method stub
		
	}

	
	

}
