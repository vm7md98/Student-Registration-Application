package Model;

public abstract class Person {

    private String id;
    private String password;
    private String name;
    private int phone;
    private String type;

    public Person() {
    }

    public Person(String id, String password, String name, int phone, String type) {
        this.id = id;
        this.password = password;
        this.name = name;
        this.phone = phone;
        this.type=type;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPhone() {
        return phone;
    }

    public void setPhone(int phone) {
        this.phone = phone;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return "Person{" + "id=" + id + ", password=" + password + ", name=" + name + ", phone=" + phone + ", type=" + type + '}';
    }



    public abstract String login(String id, String password);

}
