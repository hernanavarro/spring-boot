package sample.actuator;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import org.junit.Test;

public class HelloWorldServiceTest {

	@Test
	public void expectedMessage() {
		HelloWorldService helloWorldService = new HelloWorldService();
		assertEquals("Expected correct message","Spring boot says hello from a Docker container",helloWorldService.getHelloMessage());
	}

	@Test
	public void secondTest() {
		HelloWorldService serviceMock = mock(HelloWorldService.class);

		when(serviceMock.getHelloMessage()).thenReturn("Hola Hola").thenReturn("Hello Hello");

		assertEquals("Expected correct message", "Hola Hola", serviceMock.getHelloMessage());
		assertEquals("Expected correct message", "Hello Hello", serviceMock.getHelloMessage());
	}

}
