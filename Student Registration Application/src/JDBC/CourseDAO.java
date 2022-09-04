package JDBC;

import Model.Data;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import Model.*;

public class CourseDAO {

    public Data<Course> getAllCourses() throws SQLException {

        Connection conn = DBConnection.getConnection();
        Statement stmt = conn.createStatement();

        Course course = new Course();
        String sql = course.getAllCourses();

        ResultSet rs = stmt.executeQuery(sql);


        Data<Course> courseList = new Data();

        while (rs.next()) {
            String courseName = rs.getString("courseName");
            String courseCode = rs.getString("courseCode");
            int semester = rs.getInt("semester");
            int studentid = rs.getInt("studentid");

            course = new Course(courseName, courseCode, semester, studentid);

            courseList.add(course);
        }

        //close all the db resources
        rs.close();
        stmt.close();
        conn.close();

        return courseList;
    }

}
