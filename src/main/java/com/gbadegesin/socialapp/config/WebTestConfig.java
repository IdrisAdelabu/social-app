package com.gbadegesin.socialapp.config;

import java.sql.SQLException;

import com.gbadegesin.socialapp.provider.ResourceProvider;
import org.h2.tools.Server;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

@Configuration
@Profile("test")
public class WebTestConfig {

	@Autowired
    ResourceProvider resourceProvider;
	
	@Bean(initMethod = "start", destroyMethod = "stop")
	Server inMemoryH2DatabaseServer() throws SQLException {
			
		    return Server.createTcpServer(this.resourceProvider.getH2ServerParams());
	}
}
