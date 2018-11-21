package by.pvt.service;

import java.security.InvalidParameterException;
import java.util.Arrays;

/**
 *
 */
public class AverageServiceImpl implements AverageService {

    @Override
    public double getMean(int[] inputData) {

        if (inputData == null)
            throw new InvalidParameterException("Input data cannot be null");

        return Arrays.stream(inputData)
                .average()
                .orElse(Double.NaN);

    }
}
