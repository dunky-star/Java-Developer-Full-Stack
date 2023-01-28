package com.dunky.stream;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import reactor.core.publisher.Mono;

@SpringBootTest
class ApplicationTests {
	@Test
	public void shouldStreamSingleValue() throws Exception{
		Mono.just("Hello")
				.map(String::toUpperCase)
				.doOnSubscribe(subscription -> System.out.println("==Subscribed"))
				.doOnRequest(request -> System.out.println("==Requested"))
				.doOnSuccess(complete -> System.out.println("==Stream completed"))
				.log()
				.subscribe();
	}

	@Test
	void contextLoads() {
	}

}
