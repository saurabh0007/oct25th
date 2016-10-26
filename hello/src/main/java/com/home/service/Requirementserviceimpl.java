package com.home.service;

	import java.util.List;
	import org.springframework.beans.factory.annotation.Autowired;
	import org.springframework.stereotype.Service;
	
import com.home.dao.RequirementDAO;
import com.home.model.Requirement;

	@Service
	
	public class Requirementserviceimpl implements Requirementservice{
		@Autowired
		RequirementDAO udao;
		public void addRequirement(Requirement r) {
			// TODO Auto-generated method stub
			udao.addRequirement(r);
		}

		public void updateRequirement(Requirement r) {
			// TODO Auto-generated method stub
			udao.updateRequirement(r);
		}

		public List<Requirement> listRequirement() {
			// TODO Auto-generated method stub
			return udao.listRequirement();
		}

		public Requirement getRequirementById(int id) {
			// TODO Auto-generated method stub
			return udao.getRequirementById(id);
		}

		public void removeRequirement(int id) {
			// TODO Auto-generated method stub
			udao.removeRequirement(id);
	
		}
	}
		
	