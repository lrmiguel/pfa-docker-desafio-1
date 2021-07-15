package com.github.lrmiguel.pfa_docker_desafio1.core.entity;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import org.hibernate.Hibernate;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.util.Objects;

@Entity(name = "module")
@Getter
@Setter
@ToString
public class CourseModule {

    @Id
    private String id;
    private String name;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || Hibernate.getClass(this) != Hibernate.getClass(o)) return false;
        CourseModule that = (CourseModule) o;

        return Objects.equals(id, that.id);
    }

    @Override
    public int hashCode() {
        return 588640416;
    }
}
