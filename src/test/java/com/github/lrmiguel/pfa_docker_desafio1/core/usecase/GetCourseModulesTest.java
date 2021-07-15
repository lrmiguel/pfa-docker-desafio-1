package com.github.lrmiguel.pfa_docker_desafio1.core.usecase;

import com.github.lrmiguel.pfa_docker_desafio1.infra.repository.CourseModulesRepositoryMySQL;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import static org.mockito.Mockito.verify;

public class GetCourseModulesTest {

    @Test
    @DisplayName("Should get course modules")
    void getCourseModulesTest() {
        var repository = Mockito.mock(CourseModulesRepositoryMySQL.class);
        var getCourseModules = new GetCourseModules(repository);
        getCourseModules.execute();
        verify(repository).findAll();
    }
}
