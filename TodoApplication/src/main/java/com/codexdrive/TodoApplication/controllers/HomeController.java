package com.codexdrive.TodoApplication.controllers;

import com.codexdrive.TodoApplication.Config.CodexdriveConfig;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@RestController
public class HomeController {
    @Value("${codexdrive.profile.image.path}")
    private String profilePath; //variable
    @Autowired
    private CodexdriveConfig codexdriveConfig;

    @RequestMapping("/todos")
    public List<String> JustTest() {
        List<String> todos = Arrays.asList("learn java",
                "learn spring boot",
                "develop projects",
                "learn django",
                "learn Node JS"

        );
        return todos;
    }

    @RequestMapping("/profile-path")
    public String getProfilePath() {

        return this.profilePath;
    }
@RequestMapping("/codexdriveConfig")
    public CodexdriveConfig getCodexdriveConfig(){
        System.out.println(this.codexdriveConfig);
        return this.codexdriveConfig;
    }
}