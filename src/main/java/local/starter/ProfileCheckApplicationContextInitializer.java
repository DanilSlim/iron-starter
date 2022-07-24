package local.starter;

import org.springframework.context.ConfigurableApplicationContext;

/**
 * @author danil
 * Работает когда контекст еще не создан
 * Ранняя проверка пропертей задолго до рефреша контекста
 *
 */
public class ProfileCheckApplicationContextInitializer implements org.springframework.context.ApplicationContextInitializer<ConfigurableApplicationContext>{

	@Override
	public void initialize(ConfigurableApplicationContext applicationContext) {
		
		if (applicationContext.getEnvironment().getActiveProfiles().length == 0) {
			
			throw new RuntimeException("without profile НИЗЗЯ");
		}
		
	}

}
