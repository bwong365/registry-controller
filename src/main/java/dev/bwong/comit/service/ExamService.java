package dev.bwong.comit.service;

import dev.bwong.comit.entity.Exam;

import java.util.Set;

public interface ExamService {
    public Set<Exam> findExamsByBothIds(Long courseId, Long studentId);
}
