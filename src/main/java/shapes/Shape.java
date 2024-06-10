package shapes;

public abstract class Shape {
    protected String name;

    public Shape(String name) {
        this.name = name;
    }

    public void displayName() {
        System.out.println("Shape name: " + name);
    }
}