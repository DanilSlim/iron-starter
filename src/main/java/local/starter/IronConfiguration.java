package local.starter;

import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;

import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import local.starter.annotation.ConditionalOnProdaction;
import local.starter.annotation.ConditionalOnRaven;

/**
 * @author danil
 *If @ConditionalOnProdaction
 *   @Configuration
 *   public class IronConfiguration {
 *   then @ConditionalOnProdaction will working twice if this class placed in starter
 *   if this class placed in your Application @ConditionalOnProdaction will working thrice
 *   
 *      @ConditionalOnRaven annotation compose @ConditionalOnProperty("raven.where") 
 *      and @ConditionalOnProperty(prefix = "raven",name = "ravenSwitch", havingValue = "true") both
 *      This annotation do opportunity has nested annotations
 */
@Configuration
@EnableConfigurationProperties(RavenProperties.class)

public class IronConfiguration {

    @Bean
    @ConditionalOnProdaction
    //@ConditionalOnProperty("raven.where")
    @ConditionalOnRaven
    @ConditionalOnMissingBean
    RavenListener ravenListener(RavenProperties r) {
        return new RavenListener(r);
    }
    
    @Bean
    ProphetProperties ProphetProperties() {
    	
    	return new ProphetProperties();
    }

}
