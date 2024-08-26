package JDBCProject;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
public class jdbcclass3 {

	public static void main(String[] args) throws Exception {
		Statement st;
		Connection con;
		Class.forName("com.mysql.cj.jdbc.Driver");
		System.out.println("drivewr loaded and register");
		con=DriverManager.getConnection("jdbc:mysql://localhost/mobiles","root","Tulasi@2001");
		System.out.println("connection is established");
		st=con.createStatement();
		st.execute("create table mobile(mid int,mname varchar(20))");
		st.execute("insert into mobile  values(1,'oppo')");
		st.execute("insert into  mobile values(2,'realme')");
		st.execute("insert into  mobile values(3,'redmi')");
		st.execute("update table mobile set mname='iphone' where mid=2");
		
		System.out.println("table is created successfully");
		st.close();
		con.close();
		
}
}