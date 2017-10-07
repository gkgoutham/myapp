package org.gk.shopping.app;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.datatype.hibernate4.Hibernate4Module;

public class HibernateAwareObjectMapper extends ObjectMapper {

	/**
	 * 
	 */
	private static final long serialVersionUID = -5715333170129339526L;

	public HibernateAwareObjectMapper() {
		Hibernate4Module module = new Hibernate4Module();
		module.enable(Hibernate4Module.Feature.FORCE_LAZY_LOADING);
		registerModule(module);
	}
}
