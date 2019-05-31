package dev.bwong.comit.service;

import dev.bwong.comit.dao.ExamRepository;
import dev.bwong.comit.entity.Exam;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Set;

@Service
public class ExamServiceImpl implements ExamService {

    @Autowired
    private ExamRepository examRepository;

    @Override
    public Set<Exam> findExamsByBothIds(Long courseId, Long studentId) {
        return examRepository.findAllByCourseIdAndStudentId(courseId, studentId);
    }

}
