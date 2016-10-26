package com.home.dao;

import java.util.List;

import com.home.model.Requirement;

public interface RequirementDAO {

	public void addRequirement(Requirement r);
	public void updateRequirement(Requirement r);
	public List<Requirement> listRequirement();
	public Requirement getRequirementById(int id);
	public void removeRequirement(int id);


}