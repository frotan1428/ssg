package polymorphism;

public class Cal2 {

    public int add( int a,int b){
        return a+b;
    }

    public static void main(String[] args) {

       Cal2 cal2=new Cal2();
        System.out.println(cal2.add(4,6));
    }
}
