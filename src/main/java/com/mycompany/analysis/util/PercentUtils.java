package com.mycompany.analysis.util;

import java.math.BigDecimal;
import java.math.RoundingMode;

/**
 *
 * @author mbk_i
 */
public class PercentUtils {

    public static String calculateToPercent(BigDecimal amount, BigDecimal amountAll) {
        BigDecimal percent = (amount.divide(amountAll, 5, RoundingMode.HALF_UP)).multiply(new BigDecimal(100));
        return String.format("%.2f", percent) + "%";
    }

}
