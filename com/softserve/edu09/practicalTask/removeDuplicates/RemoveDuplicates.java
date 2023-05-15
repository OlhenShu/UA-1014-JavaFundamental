package com.softserve.edu09.practicalTask.removeDuplicates;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class RemoveDuplicates {
    private List<String> inputList;
    private final List<String> uniqueElements = new ArrayList<>();

    public RemoveDuplicates(String input) {
        setInputList(input);
    }

    public List<String> getInputList() {
        return inputList;
    }

    public void setInputList(String input) {
        this.inputList = Arrays.asList(input.split(", "));
    }

    public void showUniqueElements() {
        removeDuplicates();

        for (String element : uniqueElements) {
            System.out.print(element + " ");
        }
    }

    private void removeDuplicates() {
        for (String element : getInputList()) {
            if (!uniqueElements.contains(element)) {
                uniqueElements.add(element);
            }
        }
    }
}
