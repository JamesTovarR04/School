package lessons;
import users.Teacher;
import users.Student;
import java.util.ArrayList;

public class Lesson {

    private final int id;
    private final String name;
    private Teacher teacher;
    private ArrayList<Student> students;
    private ArrayList<Exercise> exercises;

    public Lesson(int id, String name, Teacher teacher) {
        this.id = id;
        this.name = name;
        this.teacher = teacher;
        this.teacher.addLesson(this);
    }

    public String getName(){
        return name;
    }

    public int getId() {
        return id;
    }

    public Teacher getTeacher() {
        return teacher;
    }

    public void setTeacher(Teacher teacher) {
        this.teacher.removeLesson(this);
        this.teacher = teacher;
    }

    public ArrayList<Exercise> getExercises() {
        return exercises;
    }

    public ArrayList<Student> getStudents() {
        return students;
    }

    public void addExercise(Exercise exercise){
        exercises.add(exercise);
    }

    public void addStudent(Student student){
        students.add(student);
    }

    public void removeStudent(Student student){
        student.removeLesson(this);
        students.remove(student);
    }

}