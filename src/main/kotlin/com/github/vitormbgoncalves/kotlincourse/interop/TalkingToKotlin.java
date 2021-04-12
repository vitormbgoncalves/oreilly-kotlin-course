package com.github.vitormbgoncalves.kotlincourse.interop;

import com.github.vitormbgoncalves.kotlincourse.classes.CustomerKotlin;
import com.github.vitormbgoncalves.kotlincourse.classes.CustomerKotlinKt;
import com.github.vitormbgoncalves.kotlincourse.classes.Status;

import java.io.IOException;

/**
 *<p>
 *  Sample Java Class
 *</p>
 *<p>
 * @author Vitor Goncalves
 * @since 08.04.2021, qui, 19:02
 *</p>
 */

public class TalkingToKotlin {

    public void loadStats(CustomerKotlin customerKotlin) {
        try {
            customerKotlin.loadStatistics("Filename");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        CustomerKotlin customerKotlin = new CustomerKotlin(1, "Vitor", "vitor@gmail.com");

        String value = customerKotlin.someProperty;

        customerKotlin.changeStatus(Status.Current);
        customerKotlin.changeStatus();
        customerKotlin.preferential();

        // TopLevelFunctionsKt.prefix("Some", "value");

        UtilityClass.prefix("Some", "value");

        int CopyrightYear = UtilityClass.CopyrightYear;

        CustomerKotlinKt.extension(customerKotlin);
    }
}
