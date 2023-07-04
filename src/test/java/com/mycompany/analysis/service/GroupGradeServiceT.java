package com.mycompany.analysis.service;

import com.mycompany.analysis.service.impl.GroupGradeServiceImpl;
import com.mycompany.generater.model.Student;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import org.assertj.core.api.Assertions;
import org.junit.Test;

/**
 *
 * @author mbk_i
 */
public class GroupGradeServiceT {

    GroupGradeService groupGradeService = new GroupGradeServiceImpl();

    @Test
    public void gruopGradeResult() {
        List<Student> students = new ArrayList<>();
        students.add(new Student("0001", 100));
        students.add(new Student("0002", 80));
        students.add(new Student("0003", 79));
        students.add(new Student("0004", 70));
        students.add(new Student("0005", 69));
        students.add(new Student("0006", 60));
        students.add(new Student("0007", 59));
        students.add(new Student("0008", 50));
        students.add(new Student("0009", 49));
        students.add(new Student("0010", 0));
        Map<String, Long> group = groupGradeService.groupingGrade(students);
        Assertions.assertThat(group.get("A")).isEqualTo(2);
    }

}
