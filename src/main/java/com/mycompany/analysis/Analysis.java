package com.mycompany.analysis;

import com.mycompany.analysis.service.AnalysisScoreService;
import com.mycompany.analysis.service.impl.AnalysisScoreServiceImpl;
import com.mycompany.generater.model.Student;
import com.mycompany.generater.service.StudentService;
import com.mycompany.generater.service.impl.StudentServiceImpl;
import java.util.List;
import java.util.Map;

/**
 *
 * @author mbk_i
 */
public class Analysis {

    public static void main(String[] args) {
        StudentService studentService = new StudentServiceImpl();
        List<Student> students = studentService.generateStudent();
        AnalysisScoreService analysisScoreService = new AnalysisScoreServiceImpl();
        Map<String, String> results = analysisScoreService.analyzeScore(students);
        System.out.println("Amount Student : " + students.size());
        for (Map.Entry<String, String> result : results.entrySet()) {
            System.out.println(result.getKey() + " = " + result.getValue());
        }

    }
}
