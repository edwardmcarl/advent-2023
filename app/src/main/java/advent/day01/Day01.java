package advent.day01;

import advent.Day;

import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Day01 implements Day {

    @Override
    public String part1(List<String> input) {
        String first;
        String last;
        int total = 0;
            
        for (String line : input) {
            Matcher mt = Pattern.compile("[1234567890]").matcher(line);
            Matcher mtr = Pattern.compile("[1234567890]").matcher(new StringBuilder(line).reverse().toString());
            if (!mt.find()){
                total += 0;
                continue;
            }
            mtr.find();
            total += 10 * Integer.parseInt(mt.group());
            total += Integer.parseInt(mtr.group());
        }

        return String.valueOf(total);
    }

    @Override
    public String part2(List<String> input) {
        
        int total = 0;
        for (String line : input) {
            Matcher mt = Pattern.compile("[1234567890]|one|two|three|four|five|six|seven|eight|nine|ten").matcher(line);
            Matcher mtr = Pattern.compile("[1234567890]|net|enin|thgie|neves|xis|evif|ruof|eerht|owt|eno").matcher(new StringBuilder(line).reverse().toString());
            if (!mt.find()){
                total += 0;
                continue;
            }
            mtr.find();

            total += 10 * p2helper(mt.group());
            total += p2helper(mtr.group());
        }

        return String.valueOf(total);
    }

    private int p2helper(String s) {
            try {
                return Integer.parseInt(s);
            } catch (NumberFormatException e) {
                switch (s) {
                    case "one":
                    case "eno":
                        return 1;
                    case "two":
                    case "owt":
                        return 2;
                    case "three":
                    case "eerht":
                        return 3;
                    case "four":
                    case "ruof":
                        return 4;
                    case "five":
                    case "evif":
                        return 5;
                    case "six":
                    case "xis":
                        return 6;
                    case "seven":
                    case "neves":
                        return 7;
                    case "eight":
                    case "thgie":
                        return 8;
                    case "nine":
                    case "enin":
                        return 9;
                    default: return 0;
                }
            }
        }
}
