package com.home.service;
import java.util.List;

import com.home.model.Donor;

public interface Donorservice {

	public void addperson(Donor D);
	public void updatePerson(Donor D);
	public List<Donor> listDonor();
	public Donor getDonorById(int id);
	public void removeDonor(int id);
	public void addDonor(Donor d);
	
}
