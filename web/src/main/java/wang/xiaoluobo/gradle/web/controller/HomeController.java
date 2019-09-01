package wang.xiaoluobo.gradle.web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import wang.xiaoluobo.gradle.service.GradleService;

@RestController
public class HomeController {

    @Autowired
    private GradleService gradleService;

    @RequestMapping("/")
    public String home(String s) {
        return gradleService.hello(s);
    }

}
