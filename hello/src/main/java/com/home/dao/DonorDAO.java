package com.home.dao;


	import java.util.List;

import com.home.model.Donor;

	public interface DonorDAO {

		public void addDonor(Donor d);
		public void updateDonor(Donor d );
		public List<Donor> listDonor();
		public Donor getDonorById(int id);
		public void removeDonor(int id);


	}

