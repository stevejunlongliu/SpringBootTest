package Controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import Config.MyConfig;

@RestController
@EnableAutoConfiguration
public class App // extends SpringBootServletInitializer implements
// EmbeddedServletContainerCustomizer
{

	MyConfig config = new MyConfig();

	@RequestMapping("/")
	String home() {
		return "hello";
	}

	@RequestMapping("/test")
	String test() {
		config.outputSource();
		return msg;
	}

	@Value("${test.msg}")
	private String msg;

	public static void main(String[] args) {
		SpringApplication.run(App.class, args);
	}

	// @Override
	// public void customize(ConfigurableEmbeddedServletContainerFactory
	// factory) {
	// config.outputSource();
	// factory.setPort(port);
	// }
}
