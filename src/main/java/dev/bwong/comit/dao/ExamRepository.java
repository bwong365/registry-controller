package dev.bwong.comit.dao;

import dev.bwong.comit.entity.Exam;
import dev.bwong.comit.entity.projection.ExamProjection;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.stereotype.Repository;

import java.util.Set;

@Repository
@RepositoryRestResource(excerptProjection = ExamProjection.class)
public interface ExamRepository extends JpaRepository<Exam, Long> {

    public Set<Exam> findAllByCourseIdAndStudentId(Long courseId, Long studentId);
}
