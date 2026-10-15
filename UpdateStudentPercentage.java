import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
public class UpdateStudentPercentage {
    private static final String URL = "jdbc:mysql://localhost:3306/studentdb";
    private static final String USER = "root";
    private static final String PASSWORD = "password";
    private static final String UPDATE_QUERY = "UPDATE student SET percentage = ? WHERE roll_no = ?";
    public static void main(String[] args) {
        double newPercentage = 88.5;
        int targetRollNo = 101;
        try (Connection con = DriverManager.getConnection(URL, USER, PASSWORD);
             PreparedStatement pstmt = con.prepareStatement(UPDATE_QUERY)) {
            pstmt.setDouble(1, newPercentage);
            pstmt.setInt(2, targetRollNo);
            int rowsAffected = pstmt.executeUpdate();
            if (rowsAffected > 0) {
                System.out.println("Success! The percentage has been updated.");
                System.out.println("Rows affected: " + rowsAffected);
            } else {
                System.out.println("No student found with Roll Number: " + targetRollNo);
            }

        } catch (SQLException e) {
            System.err.println("Database operation failed!");
            e.printStackTrace();
        }
    }
}
