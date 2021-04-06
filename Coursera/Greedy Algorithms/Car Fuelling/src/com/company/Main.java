package com.company;

import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    public static int minimumRefills(ArrayList<Integer> stations, int carFuel){
        int refills = 0;
        int currentStation = 1;

        while(currentStation < stations.size())
        {
            int lastStation = currentStation - 1;

            while ((currentStation < stations.size()) && (stations.get(currentStation) - stations.get(lastStation) <= carFuel)) {
                currentStation++;
            }

            if(currentStation == lastStation + 1)
                return -1;

            if(currentStation < stations.size()){
                refills++;
            }
        }

        return refills;
    }
    public static void main(String[] args) {
        // Sample 1:
        final int carFuel = 400;
        ArrayList<Integer> stations = new ArrayList<>(
                Arrays.asList(0, 200, 375, 550, 750, 950)
        );

        // Sample 2:
        /*
        final int carFuel = 3;
	    ArrayList<Integer> stations = new ArrayList<>(
	            Arrays.asList(0, 1, 2, 5, 9, 10)
        );
        */

        // Sample 3:
        /*
        final int carFuel = 250;
        ArrayList<Integer> stations = new ArrayList<>(
                Arrays.asList(0, 100, 150, 200)
        );
        */

        System.out.print("Stations: ");
	    stations.forEach((value) -> System.out.print(value + " "));

        System.out.print("\n- Minimum number of refills: " + minimumRefills(stations, carFuel));
    }
}
