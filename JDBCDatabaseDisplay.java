import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
public class JDBCDatabaseDisplay {
    private static final String DB_URL = "jdbc:mysql://localhost:3306/studentdb";
    private static final String USER = "root";
    private static final String PASS = "your_password";
    public static void main(String[] args) {
        String sql = "SELECT * FROM students";
        try (Connection conn = DriverManager.getConnection(DB_URL, USER, PASS);
             Statement stmt = conn.createStatement();
             ResultSet rs = stmt.executeQuery(sql)) {
            System.out.println("Roll No\tName\tAge");
            while (rs.next()) {
                int rollNo = rs.getInt("roll_no");
                String name = rs.getString("name");
                int age = rs.getInt("age");
                System.out.println(rollNo + "\t" + name + "\t" + age);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
