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

    @org.junit.Test
    public void getMode(){
        AverageService averageService = new AverageServiceImpl();

        try {
            averageService.getMean(null);
        } catch (Exception e) {
            assertEquals(e.getClass(), InvalidParameterException.class);
        }

        assertArrayEquals(new int[]{0}, averageService.getMode(new int[] {0, 0, 0, 0}));

        assertArrayEquals(new int[]{2}, averageService.getMode(new int[] {1, 2, 2, 3})) ;

        assertArrayEquals(new int[]{1,2}, averageService.getMode(new int[] {1, 2, 2, 2, 1, 1})) ;
    }

    @org.junit.Test
    public void getMedian(){
        AverageService averageService = new AverageServiceImpl();

        try {
            averageService.getMean(null);
        } catch (Exception e) {
            assertEquals(e.getClass(), InvalidParameterException.class);
        }

        assertEquals(0.0, averageService.getMedian(new int[] {0, 0, 0, 0}), 0.0);

        assertEquals(2, averageService.getMedian(new int[] {1, 2, 3}), 0.0);

        assertEquals(1.5, averageService.getMedian(new int[] {1, 0, 3, 2}), 0.0);
    }
}