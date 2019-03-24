package com.dailymed.demo3;

import org.springframework.web.bind.annotation.*;

import java.util.Objects;

@RestController
@RequestMapping("/hello")
public class InfoController {

    @GetMapping
    public @ResponseBody String sayHello(@RequestParam(required = false) String name) {
        return Objects.isNull(name) ? "Bonjour : Stranger !": "Bonjour : " + name;
    }

}
