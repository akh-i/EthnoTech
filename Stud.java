package jdbc;

import java.sql.*;

public class Stud {
    public static void main(String[] args) {
        try {
            // Load driver
            Class.forName("com.mysql.cj.jdbc.Driver");

            // Create connection
            Connection con = DriverManager.getConnection(
                "jdbc:mysql://localhost:3306/studentdb?useSSL=false&serverTimezone=UTC",
                "studuser",   // safer than root
                "Stud@123"    // password you set
            );

            // Create statement
            Statement stmt = con.createStatement();

            // Execute query
            ResultSet rs = stmt.executeQuery("SELECT * FROM student");

            // Process result set
            while (rs.next()) {
                System.out.println(
                    rs.getInt("student_id") + " " +
                    rs.getString("name") + " " +
                    rs.getString("branch") + " " +
                    rs.getInt("year") + " " +
                    rs.getString("email") + " " +
                    rs.getDouble("cgpa")
                );
            }

            // Close resources
            rs.close();
            stmt.close();
            con.close();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

