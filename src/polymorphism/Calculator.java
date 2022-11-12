package polymorphism;

public class Calculator {

    public static void add(int a,int b){
        System.out.println(a+b);
    }

    public static void add(double a,int b){
        System.out.println(a+b);
    }

    public static void add(double a,double b){
        System.out.println(a+b);
    }

    public static void add(int a,double b){
        System.out.println(a+b);
    }

    public static void add(int a,double b,int c){
        System.out.println(a+b);
    }











    public static void main(String[] args) {

        add(3,5);
        add(4,5.5);
        add(5.6,5.6);
        add(45,67,6);
    }
}
