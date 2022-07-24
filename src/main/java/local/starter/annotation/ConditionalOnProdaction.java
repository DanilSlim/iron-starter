package local.starter.annotation;


import static java.lang.annotation.RetentionPolicy.RUNTIME;

import java.lang.annotation.Retention;


import org.springframework.context.annotation.Conditional;

@Retention(RUNTIME)
@Conditional({OnProductionCondition.class})
public @interface ConditionalOnProdaction {

}
