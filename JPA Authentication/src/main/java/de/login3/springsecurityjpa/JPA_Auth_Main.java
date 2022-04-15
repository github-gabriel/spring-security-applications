package de.login3.springsecurityjpa;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EnableJpaRepositories(basePackageClasses = UserRepository.class)
public class JPA_Auth_Main {

    public static void main(String[] args) {
        SpringApplication.run(JPA_Auth_Main.class, args);
    }

}
