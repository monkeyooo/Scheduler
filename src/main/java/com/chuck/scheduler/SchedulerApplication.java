package com.chuck.scheduler;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@EnableJpaRepositories
@Configuration
@EnableScheduling
//@ServletComponentScan //tomcat啟動會出錯
public class SchedulerApplication extends SpringBootServletInitializer {
    protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
        return application.sources(SchedulerApplication.class);
    }

    public static void main(String[] args) {
        System.setProperty("PYTHON_SCRIPT", "/Users/chuck/Desktop/Projects/Selenium-Utils/src/main/resources/ocr.py");
        SpringApplication.run(SchedulerApplication.class, args);
    }

}
