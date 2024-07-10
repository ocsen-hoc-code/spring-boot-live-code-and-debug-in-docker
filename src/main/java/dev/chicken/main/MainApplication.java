package dev.chicken.main;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;


@SpringBootApplication
@RestController
public class MainApplication {

	@Autowired
	private	JdbcTemplate jdbcTemplate;
	public static void main(String[] args) {
		SpringApplication.run(MainApplication.class, args);
	}
	@GetMapping("/")
	public String hello() {
		jdbcTemplate.execute("SELECT 1");
		return "Hello Spring Boot!";
	}
	
}
