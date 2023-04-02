package pro.evs39;

import java.util.*;

// link to the description: https://leetcode.com/problems/successful-pairs-of-spells-and-potions/
public class SolutionForExercise2300 {

    public int[] successfulPairs(int[] spells, int[] potions, long success) {
        int[] potionStrengthToNumber = countSuitableStrengthValues(potions);
        int maxPotionStrength = potionStrengthToNumber.length - 1;
        int[] result = new int[spells.length];
        for (int i = 0; i < spells.length; i++) {
            long requiredStrength = Math.floorDiv(success, spells[i]);
            if (success % spells[i] != 0)
                requiredStrength++;
            result[i] = requiredStrength <= maxPotionStrength ? potionStrengthToNumber[(int)requiredStrength] : 0;
        }
        return result;
    }

    private int[] countSuitableStrengthValues(int[] array) {
        int maxStrength = max(array);
        int[] estimatedStrength = new int[maxStrength + 1];
        Arrays.fill(estimatedStrength, 0);
        for (int potionStrength : array) {
            for (int i = 0; i <= potionStrength; i++) {
                estimatedStrength[i]++;
            }
        }
        return estimatedStrength;
    }

    private int max(int[] array) {
        int maxValue = 0;
        for (int value : array) {
            maxValue = Math.max(maxValue, value);
        }
        return maxValue;
    }

}
