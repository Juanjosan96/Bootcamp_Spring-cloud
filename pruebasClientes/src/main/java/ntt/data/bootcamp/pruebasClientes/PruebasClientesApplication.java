package ntt.data.bootcamp.pruebasClientes;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.ResponseBody;

import com.nttdata.bootcamp.Controller.Controller;

@SpringBootApplication
@ResponseBody

public class PruebasClientesApplication {

	public static void main(String[] args) {
		SpringApplication.run(PruebasClientesApplication.class, args);
	}

}
