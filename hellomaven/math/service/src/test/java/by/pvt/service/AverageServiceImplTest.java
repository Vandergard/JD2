package by.pvt.service;

import static org.junit.Assert.*;

import java.security.InvalidParameterException;

/**
 * @author alve
 */

public class AverageServiceImplTest {

    @org.junit.Test
    public void getMean() {
        AverageService averageService = new AverageServiceImpl();

        try {
            averageService.getMean(null);
        } catch (Exception e) {
            assertEquals(e.getClass(), InvalidParameterException.class);
        }

        assertEquals(0.0, averageService.getMean(new int[] {0, 0, 0, 0}), 0.0);

        assertEquals(1.5, averageService.getMean(new int[] {1, 2}), 0.0);

    }

}