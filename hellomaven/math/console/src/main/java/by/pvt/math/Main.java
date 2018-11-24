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

        //int[] inputData = InputDataGenerator.generate(10, -100, 100);
        int[] inputData = {1,2,3,4,3,7,8,9,0,2,2,3};
        System.out.println(Arrays.toString(inputData));

        System.out.println(averageService.getMean(inputData));
        for(Integer i:averageService.getMode(inputData)){
            System.out.print(i+" ");
        }
        System.out.println(averageService.getMedian(inputData));
    }
}
