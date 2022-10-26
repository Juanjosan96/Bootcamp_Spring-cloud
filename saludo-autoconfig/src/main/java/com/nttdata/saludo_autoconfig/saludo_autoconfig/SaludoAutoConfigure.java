
package com.nttdata.saludo_autoconfig.saludo_autoconfig;

import org.springframework.boot.autoconfigure.condition.ConditionalOnClass;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.nttdata.simple.simple.Saludo;

@Configuration
@ConditionalOnClass(Saludo.class)
@EnableConfigurationProperties(SaludoPropertie.class)
public class SaludoAutoConfigure {

	private final SaludoPropertie properties;

	public SaludoAutoConfigure(SaludoPropertie properties) {
		this.properties = properties;
	}
	
	@Bean
	public Saludo saludo() {
		return new Saludo(properties.getIdioma());
	}
	
}
