package dev.bwong.comit.entity.projection;

import dev.bwong.comit.entity.Course;
import dev.bwong.comit.entity.Student;
import org.springframework.data.rest.core.config.Projection;

import java.util.Set;

@Projection(name = "courseWithStudents", types = { Course.class })
public interface CourseWithStudents {
    public Long getId();
    public String getName();
    public Set<Student> getStudents();
}
