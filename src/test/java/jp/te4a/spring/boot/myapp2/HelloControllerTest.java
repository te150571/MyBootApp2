package jp.te4a.spring.boot.myapp2;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

import org.junit.Test;

public class HelloControllerTest {
	
	@Test
	public void taroTest()throws Exception {
		
		HelloController helloController = new HelloController();
		assertThat("Taro desu!", is(helloController.taro()));
	}
}
