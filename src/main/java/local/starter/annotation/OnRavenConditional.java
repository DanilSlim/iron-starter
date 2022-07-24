package local.starter.annotation;

import org.springframework.boot.autoconfigure.condition.AllNestedConditions;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;


public class OnRavenConditional extends AllNestedConditions {

	public OnRavenConditional() {
		
		super(ConfigurationPhase.REGISTER_BEAN);
		
	}
	
	
	
	@ConditionalOnProperty(prefix="raven",name="where")
	public static class R {}
	
	@ConditionalOnProperty(prefix = "raven",name = "ravenSwitch", havingValue = "true")
	public static class C {}

	
	

	
}
