package JDBCProject;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class jdbcPractice {

    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        //MySQL database connection parameters
        String url = "jdbc:mysql://localhost:mobiles"; 
        //  database name
        String user = "root"; 
        //MySQL username
        String password = "Tulasi@2001";
        //MySQL password

        // JDBC variables
        Connection connection;
        Statement statement;
        ResultSet resultSet;

            // Register JDBC driver
            Class.forName("com.mysql.cj.jdbc.Driver");

            // Open a connection
            connection = DriverManager.getConnection("jdbc:mysql://localhost:mobiles","root","Tulasi@2001");

            // Execute a query
            statement = connection.createStatement();
            resultSet = statement.executeQuery("SELECT * FROM mobile");
            // table name

            // Process the result set
           resultSet.next();
                // Example: retrieve data by column name
                int id = resultSet.getInt("2");
                String name = resultSet.getString("samsong");
                // Example: print the results
                System.out.println("2"+ "samsong");
          
    }
}
