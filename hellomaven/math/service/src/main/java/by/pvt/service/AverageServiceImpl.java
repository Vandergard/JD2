package by.pvt.service;

import java.security.InvalidParameterException;
import java.util.Arrays;
import java.util.ArrayList;
import java.util.HashSet;

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
        @Override
    public int[] getMode(int[] inputData){
        int[] countArr = new int[inputData.length];

        int max=1;
        HashSet<Integer> outputList = new HashSet<Integer>();

        if (inputData == null)
            throw new InvalidParameterException("Input data cannot be null");


        for(int i=0; i<inputData.length; i++){
            int element = inputData[i];
            for(int j=0; j<inputData.length; j++){
                if(element==inputData[j]){
                    countArr[i]++;
                }
            }
        }

        for(int i=0; i<countArr.length; i++){
            if(countArr[i]>max){
                max = countArr[i];
            }

            if(countArr[i] != 1 && countArr[i]==max){
                outputList.add(inputData[i]);
            }
        }
        //int[] out = (int[])outputList.toArray(int[outputList.size()]);
            int[] out = outputList.stream().mapToInt(i -> i).toArray();
        return out;
    }

    @Override
    public double getMedian(int[] inputData){

        double median=0;
        if (inputData == null)
            throw new InvalidParameterException("Input data cannot be null");

        Arrays.sort(inputData);

        if (inputData.length % 2 != 0){
            median = inputData[inputData.length/2];
        }
        else {
            int m = inputData.length/2;
            median = (inputData[m-1]+inputData[m])/2.;

        }

    return median;
    }
}
