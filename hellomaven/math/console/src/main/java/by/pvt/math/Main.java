package by.pvt.math;

import java.util.Arrays;
import java.util.ServiceLoader;

import by.pvt.data.InputDataGenerator;
import by.pvt.service.AverageService;

/**
 *
 */
public class Main {

    public static void main(String[] args) {

        AverageService averageService= ServiceLoader.load(AverageService.class)
                .findFirst()
                .orElseThrow(() -> new RuntimeException("Service not found"));

        int[] inputData = InputDataGenerator.generate(10, -100, 100);

        System.out.println(Arrays.toString(inputData));

        System.out.println(averageService.getMean(inputData));
    }
}
