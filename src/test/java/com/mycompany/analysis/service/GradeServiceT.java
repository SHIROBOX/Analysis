package com.mycompany.analysis.service;

import com.mycompany.generater.model.Student;
import org.junit.Test;
import org.assertj.core.api.Assertions;

/**
 *
 * @author mbk_i
 */
public class GradeServiceT {

    @Test
    public void findGradeResult() {
        Student student = new Student("665100001", 79);
        Assertions.assertThat(student.getGrade()).isEqualTo("B");
    }

}
