package local.starter;

import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextRefreshedEvent;

public class RavenListener implements ApplicationListener<ContextRefreshedEvent> {


	private final RavenProperties ravenProperties;
	
	public RavenListener(RavenProperties ravenProperties) {
		
		this.ravenProperties=ravenProperties;
	}
	
	@Override
	public void onApplicationEvent(ContextRefreshedEvent event) {
		
		ravenProperties.getWhere().forEach(s->{System.out.println("отправляем ворона в "+s);});
		System.out.println("отправляем ворона...");
	}

}
