package lessons;

import java.time.LocalDate;

public class Homework extends Exercise{

    private String description;
    private LocalDate deliveryDate;

    public Homework(int id, Lesson lesson, String name, String description, LocalDate deliveryDate) {
        super(id, lesson, name);
        this.description = description;
        this.deliveryDate = deliveryDate;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setDeliveryDate(LocalDate deliveryDate) {
        this.deliveryDate = deliveryDate;
    }

    public LocalDate getDeliveryDate() {
        return deliveryDate;
    }

    public String getDescription() {
        return description;
    }

}

