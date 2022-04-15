package de.login3.springsecurityjpa;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeResource {

    @GetMapping("/")
    public String home(){
        return ("<h1>Hier wird der Vertretungsplan einsehbar sein</h1>");
    }

    @GetMapping("/user")
    public String user(){
        return ("<h1>Hier wird das Formular einsehbar sein</h1>");
    }

    @GetMapping("/admin")
    public String admin(){
        return ("<h1>Hier wird die Admin Übersicht einsehbar sein</h1>");
    }

}