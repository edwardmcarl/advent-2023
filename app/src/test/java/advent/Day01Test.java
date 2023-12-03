package advent.day01;


import org.junit.jupiter.api.Test;

import java.util.Collections;
import java.util.List;
import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Day01Test {

    @Test
    public void testPart1(){
        // Given
        List<String> input = new ArrayList<String>();
        Collections.addAll(input, "1abc2", "pqr3stu8vwx", "a1b2c3d4e5f", "treb7uchet");


        // When
        String result = new Day01().part1(input);

        // Then
        assertEquals(144, result);
    }

    @Test
    public void testPart2(){
        // Given
        List<String> input = Collections.singletonList("test");

        // When
        String result = new Day01().part2(input);

        // Then
        assertEquals(input.get(0), result);
    }
}