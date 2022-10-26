package ntt.data.bootcamp.springcloud;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class filtros {

	@Bean
	public FiltroGlobal filter1() {
		return new Filter1();
	}
//	@Bean
//	public FiltroGlobal filter2() {
//		return new Filter2);
//	}
//	@Bean
//	public FiltroGlobal filter3() {
//		return new Filter3();
//	}
}
