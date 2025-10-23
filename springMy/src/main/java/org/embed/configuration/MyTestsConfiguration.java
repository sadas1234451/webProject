package org.embed.configuration;

import org.springframework.boot.Banner.Mode;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
@SpringBootApplication
public class MyTestsConfiguration {

	public static void main(String[] args) {
		SpringApplication application = new SpringApplication(MyTestsConfiguration.class);
		application.setBannerMode(Mode.OFF);
		application.setAdditionalProfiles("myprofile");
		application.run(args);
	}
}
