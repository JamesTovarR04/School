package qualifications;
import lessons.Exercise;
import lessons.Lesson;
import users.Student;
import java.time.LocalDate;

public class Qualification implements Score{

    private Exercise exercise;
    private double score;
    private LocalDate date;
    private Student student;

    public Qualification(Student student,Exercise exercise, double score) {
        this.exercise = exercise;
        this.score    = score;
        this.student  = student;
        date = LocalDate.now();
    }

    @Override
    public void setScore(double score) {
        if(verifyScore(score)){
            this.score = score;
            date = LocalDate.now();
        }
    }

    @Override
    public double getScore() {
        return score;
    }

    public Exercise getExercise() {
        return exercise;
    }

    public Lesson getLesson(){
        return exercise.getLesson();
    }

    public Student getStudent() {
        return student;
    }

    public LocalDate getDate() {
        return date;
    }

}

