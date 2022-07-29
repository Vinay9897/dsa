package javaconcepts;

public class polymorphismDemo {

    // This is a Run-Time Polymorphism(Method-Overriding)
    public static void main(String[] args) {

        // Shape --- CLASS_NAME
        // s -------- REFERENCE_NAME -- which is refering the object in heap memory
        // new Shape() --- it is used to allocate the memory( in the heap ) to the
        // reference (s)

        Shape s = new Shape();
        // Access the function using object
        s.draw();

        // method overriding

        s = new Rectangle(); // Rectangle class overriding the property of the parent

        s.draw();

        s = new Triangle(); // Triangle class overriding the property of the parent

        s.draw();

        s = new Square();
        s.draw();

    }

}

class Shape {
    public void draw() {
        System.out.println("Draw the Shape");
    }
}

class Triangle extends Shape {
    public void draw() {
        System.out.println("Draw the Triangle");
    }
}

class Rectangle extends Shape {
    public void draw() {
        System.out.println("Draw the Rectangle");
    }
}

class Square extends Shape {
    public void draw() {
        System.out.println("Draw the Square");
    }
}
