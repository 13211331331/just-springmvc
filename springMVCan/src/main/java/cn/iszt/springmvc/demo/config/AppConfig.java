package cn.iszt.springmvc.demo.config;

import cn.iszt.springmvc.demo.service.TestService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * Created by hanlin.huang on 2017/6/5.
 */
@Configuration
public class AppConfig {
    @Bean
    public TestService testService() {
        TestService testService = new TestService();
        return testService;
    }
}
