package com.horasphere.access.application.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.horasphere.access.domain.model.Checkinout.CheckInOutRepository;
import com.horasphere.access.infrastructure.repository.mybatis.MyBatisCheckInOutRepository;
import com.horasphere.access.infrastructure.repository.mybatis.mapper.CheckInOutMapper;

@Configuration
public class BeanConfiguration {

	@Autowired
	CheckInOutMapper checkInOutMapper;
	
	@Bean
	CheckInOutRepository checkInOutRepository() {
		return  new MyBatisCheckInOutRepository(checkInOutMapper);
	}
	
}
