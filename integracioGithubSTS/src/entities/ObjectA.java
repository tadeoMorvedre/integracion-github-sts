package entities;

public class ObjectA {
    private int id;
    private String name;
    private String surname;

    public ObjectA(int id, String name, String surname) {
        this.id = id;
        this.name = name;
        this.surname = surname;
    }

    @Override
    public String toString() {
        return "ObjectA [id=" + id + ", name=" + name + ", surname=" + surname + "]";
    }
}
