package users;
import lessons.Lesson;
import java.util.ArrayList;

public class Teacher extends User {

    private String speciality;
    private ArrayList<Lesson> lessons;

    public Teacher(int id, String name, int age, String speciality) {
        super(id, name, age);
        this.speciality = speciality;
        lessons = new ArrayList<>();
    }

    public String getSpeciality() {
        return speciality;
    }

    public void setSpeciality(String speciality) {
        this.speciality = speciality;
    }

    public ArrayList<Lesson> getLessons() {
        return lessons;
    }

    public void addLesson(Lesson lesson){
        lessons.add(lesson);
    }

    public void removeLesson(Lesson lesson){
        lessons.remove(lesson);
    }

}

