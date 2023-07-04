package com.mycompany.analysis.service.impl;

import com.mycompany.analysis.service.AnalysisScoreService;
import com.mycompany.analysis.service.GroupGradeService;
import com.mycompany.analysis.util.PercentUtils;
import com.mycompany.generater.model.Student;
import java.math.BigDecimal;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 *
 * @author mbk_i
 */
public class AnalysisScoreServiceImpl implements AnalysisScoreService {

    GroupGradeService groupGradeService = new GroupGradeServiceImpl();

    @Override
    public Map<String, String> analyzeScore(List<Student> students) {
        Map<String, String> result = new HashMap<>();
        Map<String, Long> groupGrades = groupGradeService.groupingGrade(students);
        for (Map.Entry<String, Long> groupGrade : groupGrades.entrySet()) {
            result.put(groupGrade.getKey(), PercentUtils.calculateToPercent(BigDecimal.valueOf(groupGrade.getValue()), BigDecimal.valueOf(students.size())));
        }
        return result;
    }

}
