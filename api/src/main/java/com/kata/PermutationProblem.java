package com.kata;

import org.springframework.stereotype.Component;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

@Component
public class PermutationProblem {

    public Integer[] getNextPermutation(Integer[] original) {
        Integer[] result = new Integer[original.length];
        var splitIndex = findSplitIndex(original);

        if (splitIndex == -1) {
            return original;
        }

        List<Integer> remainingElements = createListOfRemainingElements(original, splitIndex);

        copyUpToSplitIndex(original, result, splitIndex);
        result[splitIndex] = getLowestRemainingValue(remainingElements, original[splitIndex]);

        var sortedRemainingListItems = getSortedWithoutMovedElement(remainingElements, result[splitIndex]);
        copyFromListToFinalArray(sortedRemainingListItems, result, splitIndex + 1);

        return result;
    }

    private List<Integer> getSortedWithoutMovedElement(List<Integer> remainingElements, Integer movedElement) {
        List<Integer> withoutTheElementWeMoved = getListWithoutElement(remainingElements, movedElement);
        withoutTheElementWeMoved.sort(Integer::compareTo);
        return withoutTheElementWeMoved;
    }

    private Integer getLowestRemainingValue(List<Integer> remainingElements, int valueBeingReplaced) {
        return remainingElements.stream().skip(1)
                .filter(element -> element.compareTo(valueBeingReplaced) > 0)
                .min(Integer::compareTo)
                .orElse(0);
    }

    private List<Integer> getListWithoutElement(List<Integer> entireList, Integer elementToRemove) {
        return entireList.stream().filter(element -> !element.equals(elementToRemove)).collect(Collectors.toList());
    }

    private void copyFromListToFinalArray(List<Integer> remainingElements, Integer[] result, int destStartIndex) {
        for (int srcIndex = 0, destIndex = destStartIndex; srcIndex < remainingElements.size(); srcIndex++, destIndex++) {
            result[destIndex] = remainingElements.get(srcIndex);
        }
    }

    private List<Integer> createListOfRemainingElements(Integer[] original, int splitIndex) {
        return Arrays.asList(Arrays.copyOfRange(original, splitIndex, original.length));
    }

    private void copyUpToSplitIndex(Integer[] original, Integer[] result, int splitIndex) {
        System.arraycopy(original, 0, result, 0, splitIndex);
    }

    private int findSplitIndex(Integer[] rawData) {
        for (int index = rawData.length - 1; index > 0; index--) {
            if (rawData[index] > rawData[index - 1]) {
                return index - 1;
            }
        }

        return -1;
    }
}
