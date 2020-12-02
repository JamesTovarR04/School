package lessons;
import java.time.LocalDateTime;

public class Exam extends Exercise{

    private int timeInMinutes;
    private LocalDateTime start;

    public Exam(int id, Lesson lesson, String name){
        super(id, lesson, name);
        this.start = LocalDateTime.now();
        this.timeInMinutes = 30;
    }

    public Exam(int id, Lesson lesson, String name, LocalDateTime start, int timeInMinutes) {
        super(id, lesson, name);
        this.start = start;
        this.timeInMinutes = timeInMinutes;
    }

    public void setStart(LocalDateTime start) {
        this.start = start;
    }

    public void addFiveMinutesTime(){
        timeInMinutes++;
    }

    public int getTimeInMinutes() {
        return timeInMinutes;
    }

    public LocalDateTime getStart() {
        return start;
    }

}

