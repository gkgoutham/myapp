package org.gk.shopping.app;

import java.net.UnknownHostException;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.mongodb.MongoDbFactory;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.SimpleMongoDbFactory;

import com.mongodb.MongoClient;

@Configuration
public class MongoDbRepositoryConfig {

	@Value("${mongo.db.database.name}")
	private String dataBaseName;
	
	@Value("${mongo.db.hostname}")
	private String hostName;
	
	@Value("${mongo.db.port}")
	private Integer port;
	
	@Value("${mongo.db.credentials.username")
	private String userName;

	@Value("${mongo.db.credentials.password}")
	private String password;

	/**
	 * @return MongoDbFactory
	 * @throws UnknownHostException
	 * 
	 *             Returns MongoDbFactory by creating the db link to mongo
	 *             database
	 */
	@Bean
	public MongoDbFactory mongoDbFactory() throws UnknownHostException {
		MongoClient mongoClient = new MongoClient(hostName,port);
		return new SimpleMongoDbFactory(mongoClient, dataBaseName);
	}

	/**
	 * @return MongoTemplate
	 * @throws UnknownHostException
	 * 
	 *             Returns the MongoTemplate from the MongoDBFactory
	 */
	@Bean
	public MongoTemplate mongoTemplate() throws UnknownHostException {
		return new MongoTemplate(mongoDbFactory());
	}
}
