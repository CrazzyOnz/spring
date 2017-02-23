package com.cisco.spring.demo.biz.cd;

import org.springframework.context.annotation.Condition;
import org.springframework.context.annotation.ConditionContext;
import org.springframework.core.env.Environment;
import org.springframework.core.type.AnnotatedTypeMetadata;

public class MagicExistsCondition implements Condition {

	public MagicExistsCondition() {
	}

	public boolean matches(ConditionContext context, AnnotatedTypeMetadata metadata) {
		Environment env = context.getEnvironment();
		boolean isMagic=env.containsProperty("magic");
		return isMagic;
	}
}
