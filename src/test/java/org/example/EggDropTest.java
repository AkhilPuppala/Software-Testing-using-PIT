package org.example;
import org.junit.Test;
import java.util.*;
import static org.junit.Assert.*;
public class EggDropTest {

    @Test
    public void testOneEggMultipleFloors() {
        eggDrop eggDrop = new eggDrop();
        assertEquals(10, eggDrop.superEggDrop(1, 10)); // With 1 egg and 10 floors, need 10 drops
    }

    @Test
    public void testOneFloorMultipleEggs() {
        eggDrop eggDrop = new eggDrop();
        assertEquals(1, eggDrop.superEggDrop(10, 1)); // Only 1 floor, 1 drop regardless of egg count
    }

    @Test
    public void testHighFloorsAndEggs() {
        eggDrop eggDrop = new eggDrop();
        assertEquals(14, eggDrop.superEggDrop(2, 100)); // Standard high input case
    }

    @Test
    public void testMinimumCase() {
        eggDrop eggDrop = new eggDrop();
        assertEquals(1, eggDrop.superEggDrop(1, 1)); // Minimum possible input
    }

    @Test
    public void testTwoEggsAndFewFloors() {
        eggDrop eggDrop = new eggDrop();
        assertEquals(3, eggDrop.superEggDrop(2, 6)); // Optimal number of drops with 2 eggs and 6 floors
    }
}
