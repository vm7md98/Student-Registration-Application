package Model;

public class Student extends Person {

    private int semester;
    private String major;

    public Student() {
    }

    public Student(int semester, String major, String id, String password, String name, int phone, String type) {
        super(id, password, name, phone, type);
        this.semester = semester;
        this.major = major;
    }

    public int getSemester() {
        return semester;
    }

    public void setSemester(int semester) {
        this.semester = semester;
    }

    public String getMajor() {
        return major;
    }

    public void setMajor(String major) {
        this.major = major;
    }

    @Override
    public String toString() {
        return "Student{" + "semester=" + semester + ", major=" + major + '}';
    }

    @Override
    public String login(String id, String password) {
        String querySQL = "SELECT * FROM STUDENT WHERE STUDENTID='" + id + "' AND PASSWORD = '" + password + "';";

        return querySQL;
    }

}
