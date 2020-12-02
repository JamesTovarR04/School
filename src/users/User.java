package users;

public abstract class User {

    private final int id;
    private final String name;
    private int age;

    public User(int id, String name, int age){
        this.id   = id;
        this.name = name;
        this.age  = age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getId(){
        return id;
    }

    public String getName() {
        return name;
    }

}