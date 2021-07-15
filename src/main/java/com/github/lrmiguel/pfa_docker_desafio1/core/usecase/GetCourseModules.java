package com.github.lrmiguel.pfa_docker_desafio1.core.usecase;

import com.github.lrmiguel.pfa_docker_desafio1.core.entity.CourseModule;
import com.github.lrmiguel.pfa_docker_desafio1.infra.repository.CourseModulesRepositoryMySQL;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@RequiredArgsConstructor
@Service
public class GetCourseModules {

    private final CourseModulesRepositoryMySQL courseModulesRepository;

    public List<CourseModule> execute() {
        return (List<CourseModule>) courseModulesRepository.findAll();
    }
}
