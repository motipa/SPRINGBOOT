package com.example.zyberpasspro;
import com.example.zyberpasspro.model.Admin;
import com.example.zyberpasspro.repository.AdminRepository;
import lombok.extern.slf4j.Slf4j;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
@Slf4j
public class LoadDatabase {
    @Bean
    CommandLineRunner initDatabase(AdminRepository repository) {
        return args -> {
          // log.info("Preloading " + repository.save(new Admin("Moti Augustine", "test@123")));
          // log.info("Preloading " + repository.save(new Admin("Moby Augustine", "password")));
        };
    }
}
