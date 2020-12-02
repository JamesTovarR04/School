package lessons;

public abstract class Exercise {

    private final int id;
    private final Lesson lesson;
    private final String name;

    public Exercise(int id,Lesson lesson, String name) {
        this.id = id;
        this.lesson = lesson;
        this.name = name;
    }

    public Lesson getLesson() {
        return lesson;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

}

