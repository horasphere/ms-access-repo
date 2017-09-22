package com.horasphere.access.infrastructure.repository.mybatis;

import java.util.List;
import java.util.Map;

import com.horasphere.access.domain.model.Checkinout.CheckInOutRepository;
import com.horasphere.access.infrastructure.repository.mybatis.mapper.CheckInOutMapper;

public class MyBatisCheckInOutRepository implements CheckInOutRepository{

	private CheckInOutMapper checkInOutMapper;
	
	public MyBatisCheckInOutRepository(CheckInOutMapper checkInOutMapper) {
		this.checkInOutMapper = checkInOutMapper;
	}
	
	public List<Map> findAll() {
		// TODO Auto-generated method stub
		return checkInOutMapper.findAll();
	}

}
