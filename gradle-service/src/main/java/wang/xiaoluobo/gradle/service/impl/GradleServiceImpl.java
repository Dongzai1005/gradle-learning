package wang.xiaoluobo.gradle.service.impl;

import org.springframework.stereotype.Service;
import wang.xiaoluobo.gradle.service.GradleService;

@Service
public class GradleServiceImpl implements GradleService {
    @Override
    public String hello(String s) {
        return "hello " + s;
    }
}
