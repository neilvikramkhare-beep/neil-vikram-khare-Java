public class ConnectionDemo 
{
    public static void main(String[] args) 
    {
        try 
        {
            // Load the JDBC driver
            Class.forName("com.mysql.cj.jdbc.Driver");
            
            // Establish a connection to the database
            String url = "jdbc:mysql://localhost:3306/mydatabase";
            String username = "root";
            String password = "password";
            Connection connection = DriverManager.getConnection(url, username, password);
            
            System.out.println("Connection established successfully!");
            
            // Close the connection
            connection.close();
        } 
        catch (ClassNotFoundException e) 
        {
            System.out.println("JDBC Driver not found: " + e.getMessage());
        } 
        catch (SQLException e) 
        {
            System.out.println("Database connection error: " + e.getMessage());
        }
    }
}