package com.in28minutes.getstart.getstart.demo.scope;

import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.context.annotation.ScopedProxyMode;
import org.springframework.stereotype.Component;

//if the scope on the caller needed as dependency
//like the personDAO set it as prototype, and the jdbc not, it will be personDAO as new, and the jdbc connection not
// if the personDAO singleton, and the jdbc is prototype, both will be has the same

//if the user like personDAO keep singleton but the dependecies want to be prototype than use proxy

@Component
@Scope(value = ConfigurableBeanFactory.SCOPE_PROTOTYPE, proxyMode = ScopedProxyMode.TARGET_CLASS)
public class JdbcConnection {
	public JdbcConnection() {
		System.out.println("JDBC Connection");
	}
}
