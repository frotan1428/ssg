public class E01 {

    public static void main(String[] args) {

        divided(4,1);


    }

    public static void divided( int a, int b){
        if(b==0){
            System.out.println("the number can not dived by zero");
        }else {
            System.out.println(a / b);
        }

    }

    public static void divide2(int a,int b){
        try {
            System.out.println(a/b);
        }catch (ArithmeticException e){
            System.out.println("A problem accused in division"+e);
        }
    }
}
