package com.horasphere.access.interfaces.controller;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.horasphere.access.domain.model.Checkinout.CheckInOutRepository;

@RestController
@RequestMapping("api")
public class TestController {
	
	@Autowired
	private CheckInOutRepository checkInOutRepository;
	
	@RequestMapping("test")
	public String test() {
		List<Map> rows =  checkInOutRepository.findAll();
		System.out.print(rows);
		return rows.toString();
	}
}
