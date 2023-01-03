package oopsconcept.inheritance;

public class B extends A {
    int x = 1;
    int y = 2;

    public void add() {
        System.out.println(x + y + 1);
    }

    public static void main(String[] args) {
        B obj = new B();
        obj.add();
    }
}
