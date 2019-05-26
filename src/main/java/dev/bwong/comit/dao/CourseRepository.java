package dev.bwong.comit.dao;

import dev.bwong.comit.entity.Course;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.CrossOrigin;

@Repository
public interface CourseRepository extends JpaRepository<Course, Integer> {
}
