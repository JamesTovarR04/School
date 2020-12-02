package users;

class Manager extends User{

    private int office;

    public Manager(int id, String name, int age, int office) {
        super(id, name, age);
        this.office = office;
    }

    public int getOffice() {
        return office;
    }

    public void setOffice(int office) {
        this.office = office;
    }

}

