package ua.opnu;

public class GenericThreeTuple<T, V, S> {

    public final GenericTwoTuple<T, V> twoTuple;
    public final  S third;

    public GenericThreeTuple(T first, V second, S third) {
        this.third = third;
        this.twoTuple = new GenericTwoTuple<>(first, second);
        new GenericTwoTuple<>(first, second);
    }

    @Override
    public String toString() {
        return "(" + twoTuple.first + ", " + twoTuple.second + ", " + third + ")";
    }
}
