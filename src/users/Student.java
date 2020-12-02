package users;
import lessons.Exercise;
import lessons.Lesson;
import qualifications.Qualification;
import java.util.ArrayList;

public class Student extends User{

    private int grade;
    private String address;
    private ArrayList<Lesson> lessons;
    private ArrayList<Qualification> qualifications;

    public Student(int id, String name, int age, int grade, String address){
        super(id, name, age);
        this.grade     = grade;
        this.address   = address;
        lessons        = new ArrayList<>();
        qualifications = new ArrayList<>();
    }

    public void addLesson(Lesson lesson){
        lessons.add(lesson);
    }

    public ArrayList<Lesson> getLessons() {
        return lessons;
    }

    public void removeLesson(Lesson lesson){
        lessons.remove(lesson);
    }

    public void addQualification(Exercise exercise, double score){
        if(lessons.contains(exercise.getLesson())){
            Qualification qualification = new Qualification(this,exercise,score);
            qualifications.add(qualification);
        }
    }

    public ArrayList<Qualification> getQualifications() {
        return qualifications;
    }

    public int getGrade() {
        return grade;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setGrade(int grade) {
        this.grade = grade;
    }

}
