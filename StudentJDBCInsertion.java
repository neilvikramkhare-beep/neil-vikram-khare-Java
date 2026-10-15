import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;
import java.util.Iterator;
import java.util.Connections;
public class StudentJDBCInsertion {
    public static void main(String[] args) {
        LinkedList<String> studentList = new LinkedList<>();
        studentList.add("John");
        studentList.add("Alice");
        studentList.add("Bob");
        System.out.println("Student List: " + studentList);
        studentList.clone();
        System.out.println("Cloned Student List: " + studentList);
        studentList.contains("Alice");
        System.out.println("Does the Student List contain Alice? " + studentList.contains("Alice"));
        studentList.isEmpty();
        System.out.println("Is the Student List empty? " + studentList.isEmpty());
        studentList.size();
        System.out.println("Size of the Student List: " + studentList.size());
        studentList.insert();
        System.out.println("Inserted a new student into the Student List.");
        studentList.remove();
        System.out.println("Removed a student from the Student List.");
        studentList.clear();
        System.out.println("Cleared the Student List.");
        ListIterator<String> listIterator = studentList.listIterator();
        while (listIterator.hasNext()) {
            String student = listIterator.next();
            System.out.println("Student: " + student);
        }
        Iterator<String> iterator = studentList.iterator();
        while (iterator.hasNext()) {
            String student = iterator.next();
            System.out.println("Student: " + student);
        }
        Connection connection = DriverManager.getConnection(dbURL, username, password);
        String sql = "INSERT INTO students (name) VALUES (?)";
        PreparedStatement statement = connection.prepareStatement(sql);
        for (String student : studentList) {
            statement.setString(1, student);
            statement.executeUpdate();
        }
        statement.close();
        connection.close();
    }
 }