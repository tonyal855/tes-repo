package com.ebdesk.training.controller;

import java.net.URI;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import com.ebdesk.training.model.BelajarModel;
import com.ebdesk.training.service.BelajarService;



@RestController
public class BelajarController {
 
	@Autowired
	BelajarService bs;
	BelajarModel bm;
	@GetMapping("/getall")
	public List getall() {
		return bs.getall();
				
	}
	
	@RequestMapping(value="/Insert",method=RequestMethod.POST)
	public void Insert(String id, String nama, String descrip, String steps)
	{
		bs.update(id, nama, descrip, steps);
//		return "course";
	}
}
