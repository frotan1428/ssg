package polymorphism;

public class Child extends Parent{
    @Override
    public void Print() {
        System.out.println("this my Child Method");
    }

    @Override
    void display() {
        System.out.println("This Child");
    }

    @Override
    public void add(int a, int b) {
        System.out.println(a+b);
    }
}
