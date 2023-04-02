package pro.evs39;

import org.junit.jupiter.api.*;

class SolutionForExercise2300Test {

    @Test
    void testForExample1() {
        final var spells = new int[]{5, 1, 3};
        final var potions = new int[]{1, 2, 3, 4, 5};
        final var success = 7;
        final var actual = new SolutionForExercise2300().successfulPairs(spells, potions, success);
        Assertions.assertArrayEquals(new int[]{4, 0, 3}, actual);
    }

    @Test
    void testForExample2() {
        final var spells = new int[]{3, 1, 2};
        final var potions = new int[]{8, 5, 8};
        final var success = 16;
        final var actual = new SolutionForExercise2300().successfulPairs(spells, potions, success);
        Assertions.assertArrayEquals(new int[]{2, 0, 2}, actual);
    }

}
