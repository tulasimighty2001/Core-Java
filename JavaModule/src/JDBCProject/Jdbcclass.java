package JDBCProject;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
public class Jdbcclass {

	public static void main(String[] args) throws Exception {
		Statement st;
		Connection con;
		Class.forName("com.mysql.cj.jdbc.Driver");
		System.out.println("drivewr loaded and register");
		con=DriverManager.getConnection("jdbc:mysql://localhost/employees","root","Tulasi@2001");
		st=con.createStatement();
		st.execute("create table employees(eid int,ename varchar(20))");
		st.execute("insert into students  values(1,'ramu')");
		st.execute("insert into  students values(2,'raju')");
		st.execute("insert into  students values(3,'dasu')");
		System.out.println("table is created successfully");
		st.close();
		con.close();
		
		
	}

	public static void forName(String string) {
		// TODO Auto-generated method stub
		
	}

}
