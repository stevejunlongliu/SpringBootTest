package Controller;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;
import org.springframework.web.bind.annotation.RequestMapping;

import Config.MyConfig;

//@RestController
//@EnableAutoConfiguration
@EnableEurekaServer
@SpringBootApplication
public class App // extends SpringBootServletInitializer implements
// EmbeddedServletContainerCustomizer
{

	MyConfig config = new MyConfig();

	@RequestMapping("/")
	String home() {
		return "hello";
	}

	// @RequestMapping("/test")
	// String test() {
	// config.outputSource();
	// return msg;
	// }

	// @Value("${test.msg}")
	// private String msg;

	public static void main(String[] args) {
		SpringApplication.run(App.class, args);
		// SpringApplication(App.class).web(true).run(args);
	}

	// @Override
	// public void customize(ConfigurableEmbeddedServletContainerFactory
	// factory) {
	// config.outputSource();
	// factory.setPort(port);
	// }
}
