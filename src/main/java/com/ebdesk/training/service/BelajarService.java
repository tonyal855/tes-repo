package com.ebdesk.training.service;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;

import com.ebdesk.training.model.BelajarModel;


@Service
public class BelajarService {
	
	@Autowired
	JdbcTemplate jdbc;
	public List getall() {
		String query = "Select * from course";
		return jdbc.queryForList(query);
		
	}
	
	public String update(String id, String nama, String descrip, String steps) {
	BelajarModel bs = new BelajarModel(id, nama, descrip, steps);
	//String No_Id = "005";
		String query = "INSERT INTO `course` (`id`, `nama`, `description`, `steps`) VALUES (?, ?, ?, ?) " ;
	 jdbc.update(query,bs.getId(),bs.getNama(),bs.getDescrip(),bs.getSteps());
	 return "Success";
	}
	

	


}
