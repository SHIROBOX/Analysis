package com.mycompany.analysis.service;

import com.mycompany.analysis.service.impl.AnalysisScoreServiceImpl;
import com.mycompany.generater.model.Student;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.junit.Test;

/**
 *
 * @author mbk_i
 */
public class AnalysisScoreServiceT {

    AnalysisScoreService analysisScoreService = new AnalysisScoreServiceImpl();

    @Test
    public void scoreResult() {
        List<Student> students = new ArrayList<>();
        students.add(new Student("0001", 100));
        students.add(new Student("0002", 80));
        students.add(new Student("0003", 79));
        students.add(new Student("0004", 70));
        students.add(new Student("0005", 69));
        students.add(new Student("0006", 60));
        students.add(new Student("0007", 59));
        students.add(new Student("0008", 50));
        //students.add(new Student("0009", 49));
        // students.add(new Student("0010", 0));
        Map<String, String> score = analysisScoreService.analyzeScore(students);
        System.out.println(score);
    }

}
