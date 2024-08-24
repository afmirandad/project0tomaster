package com.message.helloword;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api")
public class helloworldcontroller {

    @GetMapping("/hello/{nombre}")
    public String hello(@PathVariable String nombre) {
        return "Hello World! es un tema de tiempo "+nombre;
    }

    @PostMapping("/hola/{nombre}")
    public String hola(@PathVariable String nombre) {
        return "Hola mundo! es un tema de tiempo "+nombre;
    }

}
