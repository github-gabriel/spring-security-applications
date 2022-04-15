package de.gabriel.springsecurityldap;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringSecurityLdapApplication {
    // Username: ben; Password: benspassword
    public static void main(String[] args) {
        SpringApplication.run(SpringSecurityLdapApplication.class, args);
    }

}
