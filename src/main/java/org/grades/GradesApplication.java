package org.grades;

import org.grades.controlcenter.ControlCenter;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class GradesApplication {
	private static ApplicationContext applicationContext = null;
	public static void main(String[] args) {
		SpringApplicationBuilder SpringAppBuilder = new SpringApplicationBuilder(GradesApplication.class);
		SpringAppBuilder.headless(false);
		applicationContext = SpringAppBuilder.run(args);
		new ControlCenter();
	}
	public static void shutdownApplication(){
		SpringApplication.exit(applicationContext, () -> 0);
	}
}