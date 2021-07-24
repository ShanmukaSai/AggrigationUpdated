package com.micro.Aggregation.Controllers;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.context.SpringBootTest.WebEnvironment;
import org.springframework.boot.web.server.LocalServerPort;



@SpringBootTest(webEnvironment = WebEnvironment.RANDOM_PORT)
class ArthemeticControllersTest {
	
	private static final Logger log = LoggerFactory
			.getLogger(ArthemeticControllersTest.class);
	
	@LocalServerPort
	private int port;
	
	@Autowired
	private ArthemeticControllers arthemeticController;

	@Test
	void AdditionOfTwoNumbersTest() {
		log.info("-----------------------------------------");
		log.info("|   AdditionOfTwoNumbersTest1  is starting     |");
		String result=arthemeticController.add(10, 20);
		assertEquals("30", result);
		String url = "http://localhost:" + port
				+ "/add/10/20";
		log.info("url is " + url);
		
		log.info("|   AdditionOfTwoNumbersTest1  is Done         |");
		
	}
	@Test
	void SubtractionOfTwoNumberstest() {
		log.info("-----------------------------------------");
		log.info("|   SubtractionOfTwoNumbersTest1  is starting  |");
		String result=arthemeticController.sub(100, 50);
		assertEquals("50", result);
		String url = "http://localhost:" + port
				+ "/sub/100/50";
		log.info("url is " + url);
		
		log.info("|   SubtractionOfTwoNumbersTest1  is Done      |");
	}
	@Test
	void MultiplicationOfTwoNumbersTest() {
		log.info("-----------------------------------------");
		log.info("|   MultiplicationOfTwoNumbersTest1 is Starting |");
		String result=arthemeticController.mul(10, 90);
		assertEquals("900", result);
		String url = "http://localhost:" + port
				+ "/mul/10/90";
		log.info("url is " + url);
		
		log.info("|   MultiplicationOfTwoNumbersTest1  is Done    |");
	}
	@Test
	void DivisionOfTwoNumbersTest() {
		log.info("-----------------------------------------");
		log.info("|   DivisionOfTwoNumbersTest1  is Starting     |");
		String result=arthemeticController.div(200, 20);
		assertEquals("10", result);
		String url = "http://localhost:" + port
				+ "/div/200/20";
		log.info("url is " + url);
		
		log.info("|   DivisionOfTwoNumbersTest1  is Done         |");
	}



}
