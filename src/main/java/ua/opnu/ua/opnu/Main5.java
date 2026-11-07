package ua.opnu;

public class Main5 {
    public static void main(String[] args) {
        String[] words = {"Java", "Python", "C++", "C#"};

        boolean hasPython = contains(words, "Python");
        boolean hasRuby = contains(words, "Ruby");

        System.out.println("Чи є Python у масиві? " + hasPython); // очікуємо true
        System.out.println("Чи є Ruby у масиві? " + hasRuby);     // очікуємо false

        System.out.println("-------------------------");

        Integer[] numbers = {10, 20, 30, 40, 50};

        boolean hasThirty = contains(numbers, 30);
        boolean hasHundred = contains(numbers, 100);

        System.out.println("Чи є 30 у масиві? " + hasThirty);     // очікуємо true
        System.out.println("Чи є 100 у масиві? " + hasHundred);
    }

    public static <T extends Comparable<T>, V extends T> boolean contains(T[] array, V element) {

        for (T str : array)

            if (str.compareTo(element)==0) {
                return true;
            }

        return false;
    }
}