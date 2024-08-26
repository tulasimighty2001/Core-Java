
	package JDBCProject;
	import java.sql.Connection;
	import java.sql.*;
	import java.sql.DriverManager;
import java.sql.Types;
		public class CallableStatements {

			public static void main(String[] args) throws Exception {
		
		Connection con;
				Class.forName("com.mysql.cj.jdbc.Driver");
				System.out.println("drivewr loaded and register");
				con=DriverManager.getConnection("jdbc:mysql://localhost/mobiles","root","Tulasi@2001");
				System.out.println("connection is establised"); 
				CallableStatement cs=con.prepareCall("call PREE(?,?)");
				cs.setInt(1,1);
				cs.registerOutParameter(2,Types.VARCHAR);
				cs.execute();
			String str=cs.getString(2);
				System.out.println(str);
				cs.close();
				con.close();
			   	
			}
		}

