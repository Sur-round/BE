package com.example.surround;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.boot.autoconfigure.orm.jpa.HibernateJpaAutoConfiguration;
import org.springframework.boot.autoconfigure.data.jpa.JpaRepositoriesAutoConfiguration;

@SpringBootApplication(exclude={DataSourceAutoConfiguration.class,
								HibernateJpaAutoConfiguration.class,
								JpaRepositoriesAutoConfiguration.class})
public class SurroundApplication {
 	public static void main(String[] args) {
		SpringApplication.run(SurroundApplication.class, args);
	}

}
