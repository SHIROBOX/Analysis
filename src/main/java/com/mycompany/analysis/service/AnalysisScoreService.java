package com.mycompany.analysis.service;

import com.mycompany.generater.model.Student;
import java.util.List;
import java.util.Map;

/**
 *
 * @author mbk_i
 */
public interface AnalysisScoreService {

    public Map<String, String> analyzeScore(List<Student> students);

}
