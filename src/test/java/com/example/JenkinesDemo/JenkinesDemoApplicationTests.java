package com.example.JenkinesDemo;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import com.example.JenkinesDemo.controller.Hello;


@SpringBootTest
class JenkinesDemoApplicationTests {

	@Test
	void contextLoads() {
	}
	
	
          @Test
	  void printHello() {
	   
	  Hello he = new Hello();
	    assertThat(he.hello()).isEqualTo("hello welcome to java");
	  }

}
