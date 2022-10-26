package com.nttdata.bootcamp.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import io.micrometer.core.instrument.Counter;
import io.micrometer.core.instrument.MeterRegistry;

public class PruebaController {
	private Counter counter;

	public PruebaController(MeterRegistry registry) {
	        this.counter = Counter.builder("invocaciones.hello").description("Invocaciones totales").register(registry);
	    }
	@ResponseBody

	@GetMapping(path="/helloWorld")
	    public String helloWorld() {
	        counter.increment();
	        return "hello World";
	    }
}
