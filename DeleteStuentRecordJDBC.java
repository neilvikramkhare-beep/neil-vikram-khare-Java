import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;
public class DeleteStudentRecordJDBC {
    private static final String DB_URL = "jdbc:mysql://localhost:3306/studentdb";
    private static final String USER = "root";
    private static final String PASS = "your_password";
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter Student Roll Number to delete: ");
        int rollNo = scanner.nextInt();
        scanner.close();
        String sql = "DELETE FROM students WHERE roll_no = ?";
        try (Connection conn = DriverManager.getConnection(DB_URL, USER, PASS);
             PreparedStatement pstmt = conn.prepareStatement(sql)) {
            pstmt.setInt(1, rollNo);
            int rowsAffected = pstmt.executeUpdate();
            if (rowsAffected > 0) {
                System.out.println("Record with Roll Number " + rollNo + " deleted successfully!");
            } else {
                System.out.println("No student found with Roll Number " + rollNo);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
