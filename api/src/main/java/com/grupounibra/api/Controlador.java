package com.grupounibra.api;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@restController
@requestMapping("/")

public class Controlador {
    
    @setMapping
    public String olaMundo(){
        return "Ola mundo";
    }
}
