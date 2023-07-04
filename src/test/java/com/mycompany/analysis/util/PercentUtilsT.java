package com.mycompany.analysis.util;

import java.math.BigDecimal;
import org.assertj.core.api.Assertions;
import org.junit.Test;

/**
 *
 * @author mbk_i
 */
public class PercentUtilsT {

    @Test
    public void calculateToPercent() {
        Assertions.assertThat(PercentUtils.calculateToPercent(BigDecimal.valueOf(10), BigDecimal.valueOf(100))).isEqualTo("10.00%");
    }

}
