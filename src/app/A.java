package app;

public class A<T> {

    /*Integer i;*/

    /*Object j;*/

    T k;

    /*public A(Integer i) {
        this.i = i;
    }*/

    public A(T k) {
        this.k = k;
    }

    /*public A(Object j) {
        this.j = j;
    }*/

    /*public Integer getI() {
        return i;
    }*/

    /*public Object getJ() {
        return j;
    }*/

    public T getK() {
        return k;
    }

    /*void show() {
        System.out.println(i.getClass().getSimpleName());
    }*/

    /*void show() {
        System.out.println(j.getClass().getSimpleName());
    }*/

    void show() {
        System.out.println(k.getClass().getSimpleName());
    }
}
