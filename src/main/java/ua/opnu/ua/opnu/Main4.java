package ua.opnu;
import java.util.Arrays;
import java.util.function.Predicate;

public class Main4 {
    public static void main(String[] args) {

    }

    public <T> T[] filter(T[] input, Predicate p) {
        T[] result = (T[]) new Object[input.length];

        int counter = 0;
        for (T i : input) {
            if (p.test(i)) {
                result[counter] = i;
                counter++;
            }
        }

        return Arrays.copyOfRange(result, 0, counter);
    }
}