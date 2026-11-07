package ua.opnu;

public class Main {
    public static void main(String[] args) {
    MyOptional myOptionalObj = new MyOptional<>(67);
    System.out.println(myOptionalObj.isPresent());
    System.out.println(myOptionalObj.isEmpty());
    System.out.println(myOptionalObj.toString());
    System.out.println(myOptionalObj.get());
    System.out.println(myOptionalObj.orElse(true));
    }
}

