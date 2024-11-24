package com.example.selectionsortproject;
import java.util.Objects;
import java.util.Arrays;
import java.util.regex.Pattern;

public class SortingAlgorithm {
    public SortingAlgorithm() {};

    public String checkInput(String input) {
        // Check if input is "quit"
        if (Objects.equals(input, "quit")) {
            return input;
        }

        String[] splitInput = input.split("\\s+");
        // Check if inputs are integers and single digit
        for (String s : splitInput) {
            if (!Pattern.matches("[0-9]", s)) {
                return "Input has to be single digit integers";
            }
        }
        // Check if input length is between 3 and 8
        if (splitInput.length > 8 || splitInput.length < 3) {
            return "Input length should be between 3 and 8";
        }

        return input;
    }

    public int[] parseInput(String input) {
        String[] splitInput = input.split("\\s+");
        int[] inputIntArr = new int[splitInput.length];
        for (int i = 0; i < splitInput.length; i++) {
            inputIntArr[i] = Integer.parseInt(splitInput[i]);
        }
        return inputIntArr;
    }
//
//    public String insertionSort(String input) {
//        StringBuilder result = new StringBuilder();
//        result.append("your input: ").append(input).append("\n");
//        String checkedInput = checkInput(input);
//        if (!Objects.equals(checkedInput, input)) {
//            return checkedInput;
//        }
//        if (Objects.equals(checkedInput, "quit")) {
//            MainActivity main = new MainActivity();
//            main.quit();
//        }
//        int[] parsedInput = parseInput(input);
//
//        // Insertion sort algorithm
//        for (int i = 1; i < parsedInput.length; i++) {
//            int currentComp = parsedInput[i];
//            int j = i - 1;
//
//            while (j >= 0 && parsedInput[j] > currentComp) {
//                // Swap
//                parsedInput[j + 1] = parsedInput[j];
//                j -= 1;
//            }
//            parsedInput[j + 1] = currentComp;
//
//            result.append(Arrays.toString(parsedInput)).append("\n");
//        }
//
//        return result.toString();
//    }
}
