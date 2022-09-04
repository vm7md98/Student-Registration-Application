package Model;

public class Admin extends Person implements AdminINF {

    public Admin() {
    }

    @Override
    public String login(String id, String password) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public String getAllStudents() {
        String sql = "select * from STUDENT";
        return sql;
    }

    @Override
    public String findStudentByID(String stuId) {
        String querySQL = "SELECT * FROM STUDENT WHERE studentID='" + stuId + "';";

        return querySQL;
    }
    
    @Override
    public String delete() {
        String deleteSQL = "DELETE FROM STUDENT WHERE studentID=?;";
        return deleteSQL;
    }
}
