public class Main {
    public static void main(String[] args) {

        Student leon=new Student();
        leon.name= "Léon";
        leon.age=20;
        System.out.println("Student`s name is "+leon.name);
        System.out.println("Student`s age is "+leon.age);


        Student noName=new Student();
        noName.name= "Noname";
        noName.age= 55;
        System.out.println("Student`s name is "+noName.name);
        System.out.println("Student`s age is "+noName.age);

// public Student (String name,int age){

        Student tatjana=new Student("Tatjana",48);
        System.out.println("Student`s name is "+tatjana.name);
        System.out.println("Student`s age is "+tatjana.age);

        Student valentin= new Student("Valentin",49);
        System.out.println("Student`s name is "+valentin.name);
        System.out.println("Student`s age is "+valentin.age);
/*
Student`s name is Léon
Student`s age is 20
Student`s name is Noname
Student`s age is 55
Student`s name is Tatjana
Student`s age is 48
Student`s name is Valentin
Student`s age is 49
 */


    }
}