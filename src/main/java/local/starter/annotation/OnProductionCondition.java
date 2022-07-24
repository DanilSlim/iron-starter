package local.starter.annotation;

import javax.swing.JOptionPane;

import org.springframework.context.annotation.Condition;
import org.springframework.context.annotation.ConditionContext;
import org.springframework.core.type.AnnotatedTypeMetadata;

public class OnProductionCondition implements Condition {

	@Override
	public boolean matches(ConditionContext context, AnnotatedTypeMetadata metadata) {
	
		
	return JOptionPane.showConfirmDialog(null, "это продакшн?")==0;
		
	}

}
