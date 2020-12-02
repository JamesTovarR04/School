import lessons.Lesson;
import users.Student;
import users.Teacher;

public class School {

    public static void main(String[] args){

        // Create Teachers
        Teacher teacher1 = new Teacher(1,"Juan",32,"mathematical");
        Teacher teacher2 = new Teacher(2,"Lucy",26,"Engineer");

        // Create Students
        Student student1 = new Student(1,"Carl",15,6,"C 25 #23-26");

        // Create Lessons
        Lesson math    = new Lesson(1,"Math",teacher1);
        Lesson history = new Lesson(2,"History",teacher1);
        Lesson sport   = new Lesson(2,"Sport",teacher2);

        // add Lessons
        student1.addLesson(math);
        student1.addLesson(history);
        student1.addLesson(sport);

        System.out.println(" Example Teacher ");
        System.out.println("Id: " + teacher1.getId());
        System.out.println("Name: " + teacher1.getName());
        System.out.println("Speciality " + teacher1.getSpeciality());
        System.out.println(" lessons: ");
        for (Lesson l:teacher1.getLessons()) {
            System.out.println(l.getName());
        }

        System.out.println("\n ---------------------- \n");

        System.out.println(" Example Student ");
        System.out.println("Id: " + student1.getId());
        System.out.println("Name: " + student1.getName());
        System.out.println("Grade: " + student1.getGrade());
        System.out.println("Address: " + student1.getAddress());
        System.out.println(" lessons: ");
        for (Lesson l:teacher1.getLessons()) {
            System.out.println(l.getName());
        }



    }

}