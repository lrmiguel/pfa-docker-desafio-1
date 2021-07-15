package com.github.lrmiguel.pfa_docker_desafio1.infra.repository;

import com.github.lrmiguel.pfa_docker_desafio1.core.entity.CourseModule;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CourseModulesRepositoryMySQL extends CrudRepository<CourseModule, String> {
}
