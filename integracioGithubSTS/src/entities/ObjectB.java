package entities;

public class ObjectB {
    private int id;
    private String name;
    private int age;

    public ObjectB(int id, String name, int age) {
        this.id = id;
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "ObjectB [id=" + id + ", name=" + name + ", age=" + age + "]";
    }
}
