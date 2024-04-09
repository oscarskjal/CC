package fi.arcada.codechallenge;

import java.util.ArrayList;
import java.util.Collections;

public class Statistics {


    public static double calcmedian(ArrayList<Double> values ) {

        ArrayList<Double> sorted = new ArrayList<>(values);
        Collections.sort(sorted);
    }

    public static double calcmean(ArrayList<Double> values) {
        double sum = 0;

        for (int i = 0; i < values.size(); i++) {

            sum += values.get(i);
        }

            return sum / values.size();

        }


    }
