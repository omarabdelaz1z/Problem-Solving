package com.company;

import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;
import java.util.Scanner;

public class MajorityElement {
    private static Map<Integer, Integer> getElementsFrequencies(ArrayList<Integer> input)
    {
        Map<Integer, Integer> elementsFrequencies = new HashMap<>();

        for(Integer element : input)
        {
            if(!elementsFrequencies.containsKey(element))
                elementsFrequencies.put(element, 1);

            else
                elementsFrequencies.put(element, elementsFrequencies.get(element) + 1);
        }
        return elementsFrequencies;
    }

    public static int majorityElement(ArrayList<Integer> input) {
        Map<Integer, Integer> elementsFrequencies = getElementsFrequencies(input);
        int maximum = -1;

        for(Map.Entry<Integer, Integer> entry: elementsFrequencies.entrySet())
        {
            if(entry.getValue() > maximum)
                maximum = entry.getValue();
        }

        return (maximum > (input.size() / 2)) ? 1 : 0;
    }

    public static void main(String[] args)
    {
        Scanner userInput = new Scanner(System.in);
        int inputSize = userInput.nextInt();
        ArrayList<Integer> input = new ArrayList<>();

        for(int i = 0; i < inputSize; i++)
            input.add(userInput.nextInt());

        System.out.println(majorityElement(input));
    }
}
