package com.gbadegesin.socialapp;

import org.h2.tools.Server;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.ActiveProfiles;

@SpringBootTest
@ActiveProfiles("test")
class SocialAppApplicationTests {

	@DisplayName("Demo Test")
	@Test
	void contextLoads() {
	}

	@MockBean
	Server server;

}
