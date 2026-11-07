package ua.opnu;

public class Main6 {
    public static void main(String[] args) {

        GenericTwoTuple<String, Integer> userTuple = new GenericTwoTuple<>("Саша", 22);
        System.out.println("Кортеж з 2 елементів: " + userTuple);
        System.out.println("Ім'я: " + userTuple.first);


        GenericThreeTuple<String, Integer, Double> carTuple = new GenericThreeTuple<>("Toyota", 2020, 15500.50);
        System.out.println("\nКортеж з 3 елементів: " + carTuple);


        System.out.println("Марка авто: " + carTuple.twoTuple.first);
        System.out.println("Ціна: " + carTuple.third);
    }
}

