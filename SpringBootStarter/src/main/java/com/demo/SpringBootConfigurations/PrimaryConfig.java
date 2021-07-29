package com.demo.SpringBootConfigurations;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;


@Configuration
@ConfigurationProperties(prefix="primarydetails")
public class PrimaryConfig {
//https://stackabuse.com/the-value-annotation-in-spring
	//https://www.baeldung.com/configuration-properties-in-spring-boot
	
	public int age;
	
	public String gender;
	
	public int experience;

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public int getExperience() {
		return experience;
	}

	public void setExperience(int experience) {
		this.experience = experience;
	}
	
}
