package entities;

public class ObjectC {
    private int id;
    private String name;
    private String city;

    public ObjectC(int id, String name, String city) {
        this.id = id;
        this.name = name;
        this.city = city;
    }

    @Override
    public String toString() {
        return "ObjectC [id=" + id + ", name=" + name + ", city=" + city + "]";
    }
}
