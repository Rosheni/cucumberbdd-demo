package com.example.cucumberbdddemo;

import io.cucumber.spring.CucumberContextConfiguration;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@CucumberContextConfiguration
@SpringBootTest(classes = {Product.class})
class CucumberbddDemoApplicationTests {

	@Test
	void contextLoads() {
	}

}
