package dev.bwong.comit.controller;

import dev.bwong.comit.entity.Exam;
import dev.bwong.comit.service.ExamService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.Set;

@RestController
@RequestMapping("/api/exams")
public class ExamController {

    @Autowired
    private ExamService examService;

    @GetMapping("/reports")
    public Set<Exam> getExamsForStudentAndCourse(@RequestParam Long courseId, @RequestParam Long studentId) {
        return examService.findExamsByBothIds(courseId, studentId);
    }
}
