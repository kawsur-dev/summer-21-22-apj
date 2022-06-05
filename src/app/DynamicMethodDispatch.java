package app;

public class DynamicMethodDispatch {
    void methodA() {
        System.out.println("I am from methodA:DynamicMethodDispatch");
    }
}

class Test extends DynamicMethodDispatch {
    void methodA() {
        System.out.println("I am from methodA:Test");
    }
}
