package ua.opnu;

public class MyOptional<T> {

    private T value;
    private boolean present;

    public MyOptional() {
        present = false;
    }

    public MyOptional(T value) {
    if (value == null) {
        throw new IllegalArgumentException("Value cannot be null");
        }
    else {
        this.value = value;
        }
    present = true;
    }

    public boolean isPresent() {
            return present;
    }

    public boolean isEmpty() {
       return !present;
    }

    public T get() {

        if (isPresent()){
            return value;
        }
        else {
            throw new IllegalStateException();
        }
    }

    public T orElse(T defaultValue) {
    if (isPresent()) {
    return value;
        }
    else {
        return defaultValue;
        }
    }

    @Override
    public String toString() {
if (isPresent()) {
    return "MyOptional[value=" + value + "]";
        }
else {
    return "MyOptional[empty]";
        }
    }

}
