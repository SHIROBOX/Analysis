package com.mycompany.analysis.service.impl;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import com.mycompany.analysis.service.GroupGradeService;
import com.mycompany.generater.model.Student;

/**
 *
 * @author mbk_i
 */
public class GroupGradeServiceImpl implements GroupGradeService {

    @Override
    public Map<String, Long> groupingGrade(List<Student> student) {
        return student.stream()
                .collect(Collectors.groupingBy(Student::getGrade, Collectors.counting()));
    }

}
