package com.demo.SpringBootService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.demo.SpringBootConfigurations.PrimaryConfig;
import com.demo.SpringBootConfigurations.TrainingConfig;

@Service
public class PrimaryService {
	
	@Autowired
	TrainingConfig config;
	
	@Autowired
	PrimaryConfig pConfig;
	
	public void print(){
		System.out.println("configsssss: "+config.getProjectName());
		System.out.println("configsssss: "+pConfig.getGender());
	}
	

}
