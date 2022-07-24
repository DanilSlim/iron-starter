package local.starter;

import java.util.List;

import org.springframework.boot.context.properties.ConfigurationProperties;


@ConfigurationProperties(prefix="ironbank")
public class ProphetProperties {
	
	private List<String> whoReturnDebts;

	public List<String> getWhoReturnDebts() {
		return whoReturnDebts;
	}

	public void setWhoReturnDebts(List<String> whoReturnDebts) {
		this.whoReturnDebts = whoReturnDebts;
	}
	
	

}
