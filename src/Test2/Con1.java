package Test2;

public class Con1 {

    int id;
    String name;

    public Con1(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public static void main(String[] args) {

        Con1 con1=new Con1(12,"Ahmad");
        Con1 con2=new Con1(13,"karim");
        Con1 con3=new Con1(14,"khali");
        Con1 con4=new Con1(15,"Sami");
        

        System.out.println(con1.id + " "+ con1.name);
        System.out.println(con2.id + " "+ con2.name);
        System.out.println(con3.id + " "+ con3.name);

    }

}
