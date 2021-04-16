package co.icfes.dominio;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@SpringBootApplication
@EnableAspectJAutoProxy
public class LineaBaseMicroserviciosApplication {

	public static void main(String[] args) {
		SpringApplication.run(LineaBaseMicroserviciosApplication.class, args);
	}

}
