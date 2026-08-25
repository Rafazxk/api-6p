package com.grupounibra.api;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

 @RestController
 @RequestMapping
public class Controlador {
    
    @GetMapping("/")
    public String getMethodName(@RequestParam String param) {
        return new String();
    }
    
    public String olaMundo(){
        return "Ola mundo";
    }
}
