package de.gabriel.springsecurityoauth;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.oauth2.client.EnableOAuth2Sso;

@SpringBootApplication
public class SpringSecurityOAuthApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringSecurityOAuthApplication.class, args);
    }

}
