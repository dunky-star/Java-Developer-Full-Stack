package com.dunky.stream;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

import java.util.Arrays;

@SpringBootTest
class ApplicationTests {

	@Test
	void contextLoads() {
	}
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
	public void shouldStreamFromIterable() throws Exception{
		Flux.fromIterable(Arrays.asList("a", "b", "d", "e", "c"))
				.repeat(3)
				.filter("a"::equals)
				.map(String::toUpperCase)
				.log()
				.subscribe();
	}


}
