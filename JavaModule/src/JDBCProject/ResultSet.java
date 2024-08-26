package JDBCProject;
import java.sql.*;
public class ResultSet {

	public static void main(String[] args) throws Exception {
		
		
		Statement st;
		Connection con;
		java.sql.ResultSet rs;
		Class.forName("com.mysql.cj.jdbc.Driver");
		System.out.println("driver loaded and registered");
		con=DriverManager.getConnection("jdbc:mysql://localhost/mobiles","root","Tulasi@2001");
		System.out.println("connection is established");
		st=con.createStatement();
		rs=st.executeQuery("select mname, mid from mobile where mid=1");
		 rs.next();
		int i= rs.getInt(2);
		String ss= rs.getString(1);
		System.out.println("mobile name is"+ss);
		System.out.println("mobile id no is"+i);
		rs.close();
		st.close();
		con.close();
	}

	}


