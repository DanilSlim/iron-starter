package local.starter;

import java.util.List;

import org.springframework.boot.context.properties.ConfigurationProperties;


@ConfigurationProperties(prefix = "raven")
public class RavenProperties {
	
	

	private List<String> where;
	
	private boolean ravenSwitch;
	
	 

	public List<String> getWhere() {
		return where;
	}

	public void setWhere(List<String> where) {
		this.where = where;
	}

	public boolean isRavenSwitch() {
		return ravenSwitch;
	}

	public void setRavenSwitch(boolean ravenSwitch) {
		this.ravenSwitch = ravenSwitch;
	}

	
	
	

}
