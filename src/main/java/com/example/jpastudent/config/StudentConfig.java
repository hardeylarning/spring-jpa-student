package com.example.jpastudent.config;

import com.example.jpastudent.model.Student;
import com.example.jpastudent.service.StudentRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.Arrays;


@Configuration
public class StudentConfig {
    // to make it run
    @Bean
    CommandLineRunner commandLineRunner(StudentRepository repository) {
        return args -> {
            Student mariam = new Student("Mariam", 34);
            Student ade = new Student("Ade", 31);
            repository.saveAll(Arrays.asList(mariam, ade));
        };
    }
}
