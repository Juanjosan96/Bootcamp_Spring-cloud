package com.nttdata.saludo_autoconfig.saludo_autoconfig;

import org.springframework.boot.context.properties.ConfigurationProperties;

import lombok.Getter;
import lombok.Setter;

@ConfigurationProperties("saludo.mensaje")
@Getter
@Setter
public class SaludoPropertie {
	private String idioma = "castellano";
}
