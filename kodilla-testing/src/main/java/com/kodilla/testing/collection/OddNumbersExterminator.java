package com.kodilla.testing.collection;

import java.util.*;

public class OddNumbersExterminator {

    public ArrayList<Integer> exterminate(ArrayList<Integer> numbers) {
        ArrayList<Integer> oddNumbers = new ArrayList<>();

        for(int i = 0; i < numbers.size(); i++){
            if(numbers.get(i)% 2 == 0) {
                oddNumbers.add(numbers.get(i));
            }
        }
        return oddNumbers;
    }
}
