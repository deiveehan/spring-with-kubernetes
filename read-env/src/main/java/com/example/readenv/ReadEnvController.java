package com.example.readenv;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/kube-spring")
public class ReadEnvController {

    @RequestMapping("/read-env")
    public String readEnv() {
        String envVars="hello";
        return envVars;
    }
}
