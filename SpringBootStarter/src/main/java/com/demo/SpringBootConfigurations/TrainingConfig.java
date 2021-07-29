package com.demo.SpringBootConfigurations;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;

@Configuration
public class TrainingConfig {

	@Value("${projectdetails.name}")
	public String projectName;
	
	@Value("${projectdetails.version}")
	public String projectVersion;
	
	@Value("${projectdetails.duration}")
	public String projectDuration;

	public String getProjectName() {
		return projectName;
	}

	public void setProjectName(String projectName) {
		this.projectName = projectName;
	}

	public String getProjectVersion() {
		return projectVersion;
	}

	public void setProjectVersion(String projectVersion) {
		this.projectVersion = projectVersion;
	}

	public String getProjectDuration() {
		return projectDuration;
	}

	public void setProjectDuration(String projectDuration) {
		this.projectDuration = projectDuration;
	}
	
}
