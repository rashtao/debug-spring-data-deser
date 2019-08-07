package com.example.demo;

import com.arangodb.ArangoDB;
import com.arangodb.springframework.annotation.EnableArangoRepositories;
import com.arangodb.springframework.config.AbstractArangoConfiguration;
import org.springframework.context.annotation.Configuration;

@Configuration
@EnableArangoRepositories(basePackages = { "com.example.demo.repo" })
public class MyConfiguration extends AbstractArangoConfiguration {

	@Override
	public ArangoDB.Builder arango() {
		return new ArangoDB.Builder();
	}

	@Override
	public String database() {
		// Name of the database to be used
		return "example-database";
	}

}
