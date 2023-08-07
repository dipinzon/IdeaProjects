package Classes;

import java.util.ArrayList;
import java.util.List;

public class NumberSequenceFinder {

    public static List<List<Integer>> findContinuousSequences(Object[] input) {
        List<List<Integer>> sequences = new ArrayList<>();
        List<Integer> currentSequence = new ArrayList<>();

        for (Object element : input) {
            if (element instanceof Integer) {
                int number = (Integer) element;
                if (currentSequence.isEmpty()) {
                    // Start a new sequence if the current sequence is empty
                    currentSequence.add(number);
                } else {
                    // Check if the current number is part of the sequence
                    int lastNumber = currentSequence.get(currentSequence.size() - 1);
                    if (number == lastNumber + 1) {
                        currentSequence.add(number); // Extend the current sequence
                    } else {
                        // End of the current sequence, add it to the result list
                        sequences.add(new ArrayList<>(currentSequence));
                        currentSequence.clear();
                        currentSequence.add(number); // Start a new sequence
                    }
                }
            }
        }

        // Add the last sequence if it exists
        if (!currentSequence.isEmpty()) {
            sequences.add(new ArrayList<>(currentSequence));
        }

        return sequences;
    }
}
