package Model;

public interface AdminINF {

    public abstract String getAllStudents(); //Get all students

    public abstract String findStudentByID(String stuId); //Find student By ID
    
    public abstract String delete(); //Delete user By ID

}
