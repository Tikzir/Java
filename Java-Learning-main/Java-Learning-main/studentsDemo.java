

public class studentsDemo {
    
    public static void main (String[] args){

students student1;

        student1 = new students();
        student1.name = "Jean";
        student1.last_name = "Silv";
        student1.age = 18;
        student1.code = "99127";
        student1.career = "software engineer";
        student1.Gender = "Male";

        students AnotherStudent2 = new students("Opera", "Google", 20, "69420", "pepegacareer", "Dinosaur");
        
        students AnotherStudent = new students("Bob0", "Carter", 23, "99121", "Mode design", "Female");

        System.out.println("Student name: " + student1.name);

        AnotherStudent2.age = 30;

        System.out.println("Student age: " + AnotherStudent2.age);

    }
}
