package Model;

public class Course {

    private String courseName;
    private String courseCode;
    private int semester;
    private int studentid;

    public Course() {
    }

    public Course(String courseName, String courseCode, int semester, int studentid) {
        this.courseName = courseName;
        this.courseCode = courseCode;
        this.semester = semester;
        this.studentid = studentid;
    }

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public String getCourseCode() {
        return courseCode;
    }

    public void setCourseCode(String courseCode) {
        this.courseCode = courseCode;
    }

    public int getSemester() {
        return semester;
    }

    public void setSemester(int semester) {
        this.semester = semester;
    }

    public int getStudentid() {
        return studentid;
    }

    public void setStudentid(int studentid) {
        this.studentid = studentid;
    }

    @Override
    public String toString() {
        return "Course{" + "courseName=" + courseName + ", courseCode=" + courseCode + ", semester=" + semester + ", studentid=" + studentid + '}';
    }

    public String getAllCourses() {
        String sql = "select * from COURSE";
        return sql;
    }

}
