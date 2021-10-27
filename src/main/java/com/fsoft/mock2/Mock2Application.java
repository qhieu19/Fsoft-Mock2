package com.fsoft.mock2;

import com.fsoft.mock2.repository.UserRepository;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EnableJpaRepositories(basePackageClasses = UserRepository.class)
public class Mock2Application {

    public static void main(String[] args) {
        SpringApplication.run(Mock2Application.class, args);
    }

}
