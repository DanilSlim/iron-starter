package local.starter.annotation;

import static java.lang.annotation.RetentionPolicy.RUNTIME;

import java.lang.annotation.Retention;

import org.springframework.context.annotation.Conditional;

@Retention(RUNTIME)
@Conditional({OnRavenConditional.class})
public @interface ConditionalOnRaven {

}
