package dev.bwong.comit.entity.projection;

import dev.bwong.comit.entity.Course;
import dev.bwong.comit.entity.Exam;
import org.springframework.data.rest.core.config.Projection;

@Projection(name = "eagerExam", types = Exam.class)
public interface ExamProjection {
    int getScore();
    Course getCourse();
}

