package app;

public class Sum<T extends Number, V extends Number> {

    T value1;
    V value2;

    public Sum(T value1, V value2) {
        this.value1 = value1;
        this.value2 = value2;
    }

    public T getValue1() {
        return value1;
    }

    public void setValue1(T value1) {
        this.value1 = value1;
    }

    public V getValue2() {
        return value2;
    }

    public void setValue2(V value2) {
        this.value2 = value2;
    }

    public void show() {
        System.out.println("Type of Value1: " + value1.getClass().getName());
        System.out.println("Type of Value2: " + value2.getClass().getName());
    }

    public double add() {
        return value1.doubleValue() + value2.doubleValue();
    }

    public boolean isEqual(Sum<?, ?> o) {
        return add() == o.add();
    }

}
