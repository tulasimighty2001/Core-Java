

package JDBCProject;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
public class jdbclass2 {
public static void main(String[] args) throws Exception {
Statement st;
Connection con;
Class.forName("com.mysql.cj.jdbc.Driver");
System.out.println("drivewr loaded and register");
con=DriverManager.getConnection("jdbc:mysql://localhost/employees","root","Tulasi@2001");
st=con.createStatement();
			
st.execute("insert into students  values(1,'ramu')");
st.execute("insert into  students values(2,'raju')");
st.execute("insert into  students values(3,'dasu')");
System.out.println("table is created successfully");
st.execute("delete table students");
System.out.println("deleted table successfully");
st.close();

			con.close();
			
			
	
}
}
