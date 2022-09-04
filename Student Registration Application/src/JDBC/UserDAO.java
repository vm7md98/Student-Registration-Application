package JDBC;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import Model.*;

public class UserDAO {

    //Find User by ID
    public boolean findUserByID(String stuId, String stuPass) throws SQLException {
        Connection conn = DBConnection.getConnection();
        Statement stmt = conn.createStatement();

        Student stu = new Student();

        String querySQL = stu.login(stuId, stuPass);
        ResultSet rs = stmt.executeQuery(querySQL);

        boolean find = false;
        if (rs.next()) {
            find = true;

        }

        //close result set, statement and the connection to the database
        stmt.close();
        rs.close();
        conn.close();

        return find;
    }

    //Find Student by ID
    public Student findStudentByID(String stuId) throws SQLException {
        Connection conn = DBConnection.getConnection();
        Statement stmt = conn.createStatement();

        Admin admin = new Admin();

        String querySQL = admin.findStudentByID(stuId);
        ResultSet rs = stmt.executeQuery(querySQL);

        Student student = null;
        if (rs.next()) {
            String studentID = rs.getString("studentID");
            String password = rs.getString("password");
            String name = rs.getString("name");
            int phone = rs.getInt("phone");
            String major = rs.getString("major");
            int semester = rs.getInt("semester");
            String type = rs.getString("type");

            //put the data from the resultset into a Student Object
            student = new Student(semester, major, studentID, password, name, phone, type);
        }

        //close result set, statement and the connection to the database
        stmt.close();
        rs.close();
        conn.close();

        return student;
    }

    //Insert new User
    public int addNewStudent(String id, String password, int phone, String major, String Name, int Semester, String Type) throws SQLException {
        Connection conn = DBConnection.getConnection();
        String insertSQL = "INSERT INTO STUDENT VALUES('" + id + "','" + password + "','" + Name + "','" + phone + "','" + major + "','" + Semester + "'," + Type + ");";
        Statement stmt = conn.createStatement();
        int insertStatus = stmt.executeUpdate(insertSQL);
        stmt.close();
        conn.close();
        return insertStatus;
    }

    //Show all Users
    public Data<Student> getAllStudents() throws SQLException {

        Connection conn = DBConnection.getConnection();
        Statement stmt = conn.createStatement();

        Admin admin = new Admin();
        String sql = admin.getAllStudents();

        ResultSet rs = stmt.executeQuery(sql);

        Student student;
   
        Data<Student> studentList = new Data();

        while (rs.next()) {
            String studentID = rs.getString("studentID");
            String password = rs.getString("password");
            String name = rs.getString("name");
            int phone = rs.getInt("phone");
            String major = rs.getString("major");
            int semster = rs.getInt("semester");
            String type = rs.getString("type");

            //put the data from the resultset into a Student Object
            student = new Student(semster, major, studentID, password, name, phone, type);

            //add student to the studentList
            studentList.add(student);
        }

        //close all the db resources
        rs.close();
        stmt.close();
        conn.close();

        return studentList;
    }

    //Delete User
    public int deleteUser(String userID) throws SQLException {

        Connection conn = DBConnection.getConnection();
        Statement stmt = conn.createStatement();

        Admin admin = new Admin();
        String deleteSQL = admin.delete();

        PreparedStatement pstmt = conn.prepareStatement(deleteSQL);
        pstmt.setString(1, userID);

        int deleteStatus = pstmt.executeUpdate();
        pstmt.close();
        conn.close();

        return deleteStatus;
    }

    //Update Users
    public int updateUser(String id, String password, int phone, String major, String Name, int Semester, String Type) throws SQLException {
        Connection conn = DBConnection.getConnection();
        String updateSQL = "UPDATE STUDENT SET password ='" + password + "',name = '" + Name + "',phone = '" + phone + "',major = '" + major + "',semester = '" + Semester + "',type=" + Type + " WHERE studentID='" + id + "';";


        System.out.println(updateSQL);
        Statement stmt = conn.createStatement();
        int updateStatus = stmt.executeUpdate(updateSQL);
        stmt.close();
        conn.close();
        return updateStatus;
    }
}
