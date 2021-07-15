package com.github.lrmiguel.pfa_docker_desafio1.controller;

import com.github.lrmiguel.pfa_docker_desafio1.core.entity.CourseModule;
import com.github.lrmiguel.pfa_docker_desafio1.core.usecase.GetCourseModules;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController("/")
@RequiredArgsConstructor
public class ModulesController {
    private final GetCourseModules getCourseModules;

    @GetMapping
    public List<CourseModule> getModules() {
       return getCourseModules.execute();
    }
}
