package Test2;

public class Students {

    String name="ali";

    String lastname="Can";

    int id =1427;

    String sinif="A";



    public static void main(String[] args) {
       Students std1=new Students("frotan","ali",1427,"A");
        System.out.println(std1.name+std1.lastname +std1.id+std1.sinif);

        Students std2=new Students("frotan","ali",1427,"A");
        Object studentsDetails= std2.id+std1.sinif;
        System.out.println(studentsDetails);

    }

    public Students(String name, String lastname, int id, String sinif) {
        this.name = name;
        this.lastname = lastname;
        this.id = id;
        this.sinif = sinif;
    }



}
