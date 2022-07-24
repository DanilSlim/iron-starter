package local.starter;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.env.EnvironmentPostProcessor;
import org.springframework.core.env.ConfigurableEnvironment;

public class ProfileDetectorEnviromentPostProcessor implements EnvironmentPostProcessor{

	@Override
	public void postProcessEnvironment(ConfigurableEnvironment environment, SpringApplication application) {
		
		if(environment.getActiveProfiles().length==0 && getTemperature()<-272) {
			
			environment.setActiveProfiles("WINTER_HERE");
		} else {
			
			environment.setActiveProfiles("WINTER_NEARE");
		}
		
	}

	private int getTemperature() {
		
		return -300;
	}
	
	

}
